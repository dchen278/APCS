/*
Team Incredibly Cohesive (David Chen, Jaylen Zeng, Orion Roven)
APCS pd7
HW42 -- Be Rational
12/2/21
time elapsed: 0.1 hours
DISCO:
In order for gcd to work, we need to start checking for gcd at the minimum value between the numerator, because a smaller number % a bigger number will return the smaller number
QCC:
*/

public class Rational {
    private int denominator;
    private int numerator;

    public static void main(String[] args) {
        Rational r1 = new Rational(26, 54);
        Rational r2 = new Rational(2, 3);
        //gcd
        r1.gcd(); 
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

    public int compareTo(Rational num) {
        if (this.floatValue() > num.floatValue()) {
            return 1;
        } else if (this.floatValue() < num.floatValue()) {
            return -1;
        }
        return 0;
    }

}
