public class Methods {
    public static boolean isDivisible(int n, int m) {
        return n % m == 0;
    }

    public static boolean isTriangle(int a, int b, int c) {
        if (a + b <= c) {
            return false;
        } else if (a + c <= b) {
            return false;
        } else if (b + c <= a) {
            return false;
        }
        return true;
    }

    public static int ack(int m, int n) {
        if (m == 0) {
            return n + 1;
        } else if (m > 0 && n == 0) {
            return ack(m - 1, 1);
        } else if (m > 0 && n > 0) {
            return ack(m - 1, ack(m, n - 1));
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(isDivisible(124, 3));
        System.out.println(isTriangle(3, 4, 3));    
        System.out.println(ack(3, 3));
    }
}