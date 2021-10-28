/* Team JDK - David Chen, Kosta Dubovskiy, Jacc Chen
   APCS
   HW26: GCD Three Ways
   2021-10-27
   time spent: 0.5 hours
   DISCO: There can be different ways to do the same problem
   QCC: N/A

   ALGO: 
   0. If a is equal to b, return a
   1. Else if a is greater than b, we would then find the gcd of a-b and b
   2. Else, we would find the gcd of a and b-a
   3. This is called recursively until a or b are equal to 1
   3. Return the gcd of the two numbers
 */

public class Stats {
    public static int gcd(int a, int b) {
        int gcd = 1;
        int i = 1;
        while (i <= a && i <= b) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
            i++;
        }
        return gcd;
    }

    public static int gcdER(int a, int b) {
        // recursive version
        if (a == b) {
            return a;
        } else if (a > b) {
            return gcdER(a - b, b);
        } else {
            return gcdER(a, b - a);
        }
    }

    public static int gcdEW(int a, int b) {
        // iterative version
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println("gcd(12, 34) = " + gcd(12, 34));
        System.out.println("gcdER(12, 34) = " + gcdER(12, 34));
        System.out.println("gcdEW(12, 34) = " + gcdEW(12, 34));

        System.out.println("-----------------");

        System.out.println("gcd(323, 2312) = " + gcd(323, 2312));
        System.out.println("gcdER(323, 2312) = " + gcdER(323, 2312));
        System.out.println("gcdEW(323, 2312) = " + gcdEW(323, 2312));

        System.out.println("-----------------");

        System.out.println("gcd(22, 32) = " + gcd(22, 32));
        System.out.println("gcdER(22, 32) = " + gcdER(22, 32));
        System.out.println("gcdEW(22, 32) = " + gcdEW(22, 32));

    }
}
