public class Rational {
    public int denominator;
    public int numerator;

    public static void main(String[] args) {
        Rational r = new Rational(2, 3);
        Rational s = new Rational(1, 2);

        r.multiply(s);
        System.out.println(r.numerator + "/" + r.denominator);
        System.out.println(r.toString());
    } 

    public Rational() {
        denominator = 1;
        numerator = 0;
    }

    public Rational(int num, int denom) {
        numerator = num;
        denominator = denom;
    }

    public String toString() {
        return Double.toString(floatValue());
    }

    public void multiply(Rational num) {
        int newNum = this.numerator * num.numerator;
        int newDom = this.denominator * num.denominator;

        this.numerator = newNum;
        this.denominator = newDom;
    }

    public void divide(Rational num) {
        int newNum = this.numerator * num.denominator;
        int newDom = num.denominator * this.denominator;

        this.numerator = newNum;
        this.denominator = newDom;
    }

    public double floatValue() {
        return 0.0
    }

}
