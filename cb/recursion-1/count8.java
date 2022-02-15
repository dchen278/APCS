// Sweet Valentines : David Chen, Abdullah Faraque
// APCS pd8
// HW64: Revisitation
// 2022-02-14m
// time spent:  0.5 hrs


// Given a non-negative int n, compute recursively (no loops) the count of the
// occurrences of 8 as a digit, except that an 8 with another 8 immediately to
// its left counts double, so 8818 yields 4. Note that mod (%) by 10 yields the
// rightmost digit (126 % 10 is 6), while divide (/) by 10 removes the rightmost
// digit (126 / 10 is 12).


public class count8 {
    public static void main(String[] args) {
        System.out.println(count8(8));
        System.out.println(count8(818));
        System.out.println(count8(8818));
    }

    public static int count8(int n) {
        if (n < 10) {
            if (n == 8) {
                return 1;
            }
            return 0;
        }
        if (n % 10 == 8) {
            if (n % 100 == 88) {
                return 2 + count8(n / 10);
            }
            return 1 + count8(n / 10);
        }
        return count8(n / 10);
    }
}

