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
    public int denominator;
    public int numerator;

    public static void main(String[] args) {
        Rational r = new Rational(2, 3);
        Rational s = new Rational(1, 2);
        Rational t = new Rational();

        System.out.println("----Test toString()----");
        System.out.println(r + " expected: 2/3");
        System.out.println(s + " expected: 1/2");
        System.out.println(t + " expected: 0/1");

        System.out.println("----Test floatValue()----");
        System.out.println(r.floatValue() + " expected: 0.6666666666666666");
        System.out.println(s.floatValue() + " expected: 0.5");
        System.out.println(t.floatValue() + " expected: 0.0");

        System.out.println("----Test multiply()----");
        Rational g = new Rational(2, 13);
        Rational h = new Rational(3, 17);
        g.multiply(h);
        System.out.println(g + " expected: 6/221");

        Rational u = new Rational(1, 2);
        Rational v = new Rational(1, 3);
        u.multiply(v);
        System.out.println(u + " expected: 1/6");

        System.out.println("----Test divide()----");
        Rational w = new Rational(3, 2);
        Rational x = new Rational(9, 5);
        w.divide(x);
        System.out.println(w + " expected: 15/18");

        Rational y = new Rational(8, 2);
        Rational z = new Rational(0, 3);
        y.divide(z);
        System.out.println(y + " expected: 8/2"); // remains the same because division by zero is not allowed
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

}
