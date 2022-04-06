/*
 Represents information about SAT
*/

public class SAT {
    private String dbn, schoolName;
    private int numOfSATTakers, avgMathScore, avgReadingScore;

 
    SAT(String dbn, String schoolName, int numOfSATTakers, int avgMathScore, int avgReadingScore) {
        this.dbn = dbn;
        this.schoolName = schoolName;
        this.numOfSATTakers = numOfSATTakers;
        this.avgMathScore = avgMathScore;
        this.avgReadingScore = avgReadingScore;
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