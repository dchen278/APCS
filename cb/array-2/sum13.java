// Return the sum of the numbers in the array, returning 0 for an empty array.
// Except the number 13 is very unlucky, so it does not count and numbers that
// come immediately after a 13 also do not count.

public class sum13 {
    public static void main(String[] args) {
        System.out.println(sum13(new int[] { 1, 2, 2, 1 }));
        System.out.println(sum13(new int[] { 1, 1 }));
        System.out.println(sum13(new int[] { 1, 2, 2, 1, 13 }));
    }

    public static int sum13(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 13) {
                sum += nums[i];
            } else {
                i++;
            }
        }
        return sum;
    }

}
