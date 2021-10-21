/*
Downtown Leopard Rocks: David Chen, Lea Kwok, Raven Tang
APCS
HW21: STAtisTically Speaking...
10-20-2021
DISCO
- Private instance variables cannot be accessed from outside of their class. For example, in Teller, we cannot directly access pin. However, we can still use mutator methods to change the values of and interact with private instance variables.
- Arguments can be expressions. For ex: System.out.println(leopard.setBalance(19*2.0))
QCC
- If the instance variables are private, can toString() still run? (since it needs the vars to print them) We think the answer connects to our DISCO about directly accessing private instance vars.
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
        return (int) Math.pow(a * b, 1.0 / 2);
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
        return (int) Math.pow(a * b * c, 1.0 / 3);
    }

    public static double geoMean(double a, double b, double c) {
        return Math.pow(a * b * c, 1.0 / 3);
    }

    // main method for testing functionality
    public static void main(String[] args) {
    }

}// end class
