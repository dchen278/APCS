/*
Downtown Leopard Rocks: David Chen, Lea Kwok, Raven Tang
APCS
HW21: STAtisTically Speaking..../developing corresponding skeleton for StatsDriver developed in class
10-20-2021
DISCO
 - We can convert a double into a long and then into a int by using Math.round twice
QCC
 - Is there a way to write the geoMean method without the Math class?
 - Can we use typecasting to make the geoMean method more efficient?
*/

public class Stats {

    public static int mean(int a, int b) {
        return (a + b) / 2;
    }

    public static double mean(double a, double b) {
        return (a + b) / 2;
    }

    public static int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static double max(double a, double b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static int geoMean(int a, int b) {
        return Math.round(Math.round(Math.pow(a * b, 1.0 / 2)));
    }

    public static double geoMean(double a, double b) {
        return Math.pow(a * b, 1.0 / 2);
    }

    public static int max(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        } else if (b > a && b > c) {
            return b;
        } else if (a == b && b == c) {
            System.out.println("All numbers are equal.");
            return a;
        } else {
            return c;
        }
    }

    public static double max(double a, double b, double c) {
        if (a > b && a > c) {
            return a;
        } else if (b > a && b > c) {
            return b;
        } else if (a == b && b == c) {
            System.out.println("All numbers are equal.");
            return a;
        } else {
            return c;
        }
    }

    public static int geoMean(int a, int b, int c) {
        return Math.round(Math.round(Math.pow(a * b * c, 1.0 / 3)));
    }

    public static double geoMean(double a, double b, double c) {
        return Math.pow(a * b * c, 1.0 / 3);
    }

}// end class
