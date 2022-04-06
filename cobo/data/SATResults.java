import java.sql.Array;

import core.data.*;

public class SATResults {
    public static void main(String[] args) {
        DataSource ds = DataSource.connect("https://data.cityofnewyork.us/api/views/f9bf-2cp4/rows.xml");
        ds.setCacheTimeout(15 * 60);
        ds.load();
        ArrayList<SAT> allSATResults = ds.fetchList("dbn", "school_name", "num_of_sat_test_takers",
                "sat_critical_reading_avg_score", "sat_math_avg_score");

        System.out.println("Total schools: " + allSATResults.size());

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a school name: ");
        String schoolName = sc.next();
        System.out.println("SAT results for " + schoolName);
        for (SAT sat : allSATResults) {
            if (sat.getSchoolName().equals(schoolName)) {
                System.out.println("  " + sat.getSchoolName() + ": " + sat.getNumOfSATTestTakers() + " "
                        + sat.getSATCriticalReadingAvgScore() + " " + sat.getSATMathAvgScore());
            }
        }
    }
}