/*
Team Incredibly Cohesive (David Chen, Jaylen Zeng, Orion Roven)
APCS pd7
HW41 -- Be Rational
12/1/21
time elapsed: 0.3 hours
DISCO:
When we say r.multiply(s), in the multiply method, this refers to r and the parameter num refers to s
If we set rational r to x/0, then r defaults to the word Infinity
To fix this, in the divide and multiply methods we added a if statement that checks if the denominator is 0, and if it is, it returns from the method
QCC:
I thought that there were math errors that happen in java when a number is divided by 0
Why in this case do the numbers divided by 0 become Infinity
*/

public class Rational {
    private int denominator;
    private int numerator;

    public static void main(String[] args) {

    }

    public Rational() {
        denominator = 1;
        numerator = 0;
    }

    public Rational(int num, int denom) {
        this();
        if (denom == 0) {
            System.out.println("Denominator cannot be zero");
            return;
        }
        numerator = num;
        denominator = denom;
    }

    public String toString() {
        return numerator + "/" + denominator;
    }

    public void multiply(Rational num) {
        int newNum = this.numerator * num.numerator;
        int newDom = this.denominator * num.denominator;

        this.numerator = newNum;
        this.denominator = newDom;
    }

    public void divide(Rational num) {
        if (num.numerator == 0)
            System.out.println("ERROR: Cannot divide by 0");
        else {
            numerator *= num.denominator;
            denominator *= num.numerator;
        }
    }

    public double floatValue() {
        return (double) numerator / denominator;
    }

    public int gcd() {
        
        return 0;
    }

}
