public class Loops {
    public static double power(double x, int n) {
        double result = 1;
        for (int i = 0; i < n; i++) {
            result *= x;
        }
        return result;
    }

    public static double factorial(int n) {
        double result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static double myexp(double x, int n) {
		double result = 1.0; 
		double variable  = 1.0;
        for (int i = 1; i <= n; i++) {
            variable = variable*x/i;
            result += variable;
        }
		return result; 
	}

    public static void check(double x) {
        int i = 29;

        System.out.println(x + "\t" + myexp(x, i) + "\t" + Math.exp(x));
    }

    public static void main(String[] args) {

        System.out.println(power(2, 3));
        System.out.println(factorial(5));
        check(1);

        for (double i = -0.1; i >= -100; i *= 10) {
            check(i);
        }
    }
}
