/*
Given an array length 1 or more of ints, return the difference between the largest and smallest values in
the array. Note: the built-in Math.min(v1, v2) and Math.max(v1, v2) methods return the smaller or larger
of two values.
*/
public class bigDiff {
    public static int bigDiff(int[] nums) {
        int max = 0;
        int min = 10;
        for (int i = 0; i < nums.length; i++) {
            max = Math.max(nums[i], max);
            min = Math.min(nums[i], min);
        }
        return max - min;
    }

    public static void main(String[] args) {
        System.out.println(bigDiff(new int[] { 10, 3, 5, 6 }));
        System.out.println(bigDiff(new int[] { 7, 2, 10, 9 }));
        System.out.println(bigDiff(new int[] { 2, 10, 7, 2 }));

    }
}

