// Sweet Valentines : David Chen, Abdullah Faraque
// APCS pd8
// HW64: Revisitation
// 2022-02-14m
// time spent:  0.5 hrs

// Given n of 1 or more, return the factorial of n, which is n * (n-1) * (n-2)
// ... 1. Compute the result recursively (without loops).


public class factorial {
    public static void main(String[] args) {
        System.out.println(factorial(1));
        System.out.println(factorial(2));
        System.out.println(factorial(3));
        System.out.println(factorial(4));
        System.out.println(factorial(5));

    }

    public static int factorial(int n) {
        if (n == 1) {
            return n;
        }    
        return n*factorial(n-1);
    }

}