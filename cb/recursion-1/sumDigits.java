// Sweet Valentines : David Chen, Abdullah Faraque
// APCS pd8
// HW64: Revisitation
// 2022-02-14m
// time spent:  0.5 hrs

// Given a non-negative int n, return the sum of its digits recursively (no
// loops). Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6),
// while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).

public class sumDigits {
    public static void main(String[] args) {
        System.out.println(sumDigits(126));
        System.out.println(sumDigits(49));
        System.out.println(sumDigits(12));
    }

    public static int sumDigits(int n) {
        if (n < 10) {
            return n;
        }
        return n % 10 + sumDigits(n / 10);
    }
}
