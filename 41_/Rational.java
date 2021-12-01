public class Rational {
    public int denominator;
    public int numerator;

    public static void main(String[] args) {

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
        return "";
    }

    public void multiply(Rational num) {
        int newNum = this.numerator * num.numerator;
        int newDom = this.denominator * num.denominator;

        
    }

    public void divide(Rational num) {

    }

    public double floatValue() {
        return 0.0;
    }

}
