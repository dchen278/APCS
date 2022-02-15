// Sweet Valentines : David Chen, Abdullah Faraque
// APCS pd8
// HW64: Revisitation
// 2022-02-14m
// time spent:  0.5 hrs

// The fibonacci sequence is a famous bit of mathematics, and it happens to have
// a recursive definition. The first two values in the sequence are 0 and 1
// (essentially 2 base cases). Each subsequent value is the sum of the previous
// two values, so the whole sequence is: 0, 1, 1, 2, 3, 5, 8, 13, 21 and so on.
// Define a recursive fibonacci(n) method that returns the nth fibonacci number,
// with n=0 representing the start of the sequence.


public class fibonacci {
    public static void main(String[] args) {
        System.out.println(fibonacci(0));
        System.out.println(fibonacci(1));
        System.out.println(fibonacci(2));
        System.out.println(fibonacci(3));

    }

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }

        return fibonacci(n - 1) + fibonacci(n-2);
    }

}