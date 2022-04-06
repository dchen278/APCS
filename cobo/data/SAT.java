/*
 Represents information about SAT
*/

public class SAT {
    private String dbn, schoolName;
    private int numOfSATTakers, avgMathScore, avgReadingScore;

    SAT(String dbn, String schoolName, int numOfSATTakers, int avgMathScore, int avgReadingScore) {
        // if any argument is "s" skip entry
        if (dbn == "s" || schoolName == "s" || numOfSATTakers == -1 || avgMathScore == -1 || avgReadingScore == -1) {
            this.dbn = "";
            this.schoolName = "";
            this.numOfSATTakers = -1;
            this.avgMathScore = -1;
            this.avgReadingScore = -1;
        } else {
            this.dbn = dbn;
            this.schoolName = schoolName;
            this.numOfSATTakers = numOfSATTakers;
            this.avgMathScore = avgMathScore;
            this.avgReadingScore = avgReadingScore;
        }
    }

    public String getDbn() {
        return dbn;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public int getNumOfSATTakers() {
        return numOfSATTakers;
    }

    public int getAvgMathScore() {
        return avgMathScore;
    }

    public int getAvgReadingScore() {
        return avgReadingScore;
    }

}