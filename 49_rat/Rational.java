/*
Team Incredibly Cohesive (David Chen, Jaylen Zeng, Orion Roven)
APCS pd7
HW49 -- Rational Standards Compliance
12/22/21
time elapsed: 0.5 hours (approximation if including class time)
DISCO:
* We can use the command (Object) instanceof (Class) to check if a certain object is a member of a certain class. This statement will return a boolean.
* We can also typecast objects to turn them into an object of a specific class. For example: (Rational) obj will turn Object obj into a member of class Rational.
* (Not implemented) We can use a method called throw new ClassCastException to return a specific error message when the user or someone tries comparing two completely different classes.
QCC:
* What are the most significant differences between compareTo and equals?
*/

public class Rational implements Comparable {
    private int denominator;
    private int numerator;

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
        int gcd = Math.min(this.numerator, this.denominator);
        while (gcd < this.numerator || gcd < this.denominator) {
            if (this.numerator % gcd == 0 && this.denominator % gcd == 0) {
                break;
            }
            gcd--;
        }
        System.out.println(gcd);
        return gcd;
    }

    public void add(Rational num) {
        this.numerator = this.numerator * num.denominator + this.denominator * num.numerator;
        this.denominator = this.denominator * num.denominator;
    }

    public void subtract(Rational num) {
        this.numerator = this.numerator * num.denominator - this.denominator * num.numerator;
        this.denominator = this.denominator * num.denominator;
    }

    public void reduce() {
        int gcd = this.gcd();
        this.numerator /= gcd;
        this.denominator /= gcd;
    }

    public int compareTo(Object other) {
        if (other instanceof Rational) {
            Rational r = (Rational) other;
            int cross = this.numerator * r.denominator - this.denominator * r.numerator;
            return cross;
        } 
        throw new ClassCastException("\n CompareTo() input not a Rational");
    }

    public boolean equals(Object other) {
        if (other instanceof Rational) {
            Rational r = (Rational) other;
            return this.compareTo(r) == 0;
        } else {
            System.out.println("ERROR: Cannot compare non-rationals");
            return false;
        }
    }

}
