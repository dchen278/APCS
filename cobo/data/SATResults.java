import java.sql.Array;
import java.util.Scanner;
import core.data.*;
import java.util.ArrayList;

public class SATResults {
    public static void main(String[] args) {
        DataSource ds = DataSource.connect("https://data.cityofnewyork.us/api/views/f9bf-2cp4/rows.xml");
        ds.setCacheTimeout(15 * 60);
        ds.load();
        ArrayList<SAT> allSATResults = ds.fetchList("SAT", "row/row/dbn", "row/row/school_name", "row/row/num_of_sat_test_takers", "row/row/sat_critical_reading_avg_score", "row/row/sat_math_avg_score");

        System.out.println("Total schools: " + allSATResults.size());

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a school name: ");
        String schoolName = sc.next();
        System.out.println("SAT results for " + schoolName);
        for (SAT sat : allSATResults) {
            if (sat.getSchoolName().equals(schoolName)) {
                System.out.println("  " + sat.getSchoolName() + ": " + sat.getNumOfSATTakers() + " "
                        + sat.getAvgReadingScore() + " " + sat.getAvgMathScore());
            }
        }

        // in an unsorted dataset, find the school with the highest math score
        int highestMathScore = allSATResults.get(0).getAvgMathScore();
        String highestMathSchool = allSATResults.get(0).getSchoolName();
        
        for (SAT sat : allSATResults) {
            int mathScore = sat.getAvgMathScore();
            if (mathScore > highestMathScore) {
                highestMathScore = mathScore;
                highestMathSchool = sat.getSchoolName();
            }
        }
        System.out.println("The highest math score is " + highestMathScore + " for " + highestMathSchool);
    }
}