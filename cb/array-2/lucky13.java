// Given an array of ints, return true if the array contains no 1's and no 3's.

public class lucky13 {
    public static void main(String[] args) {
        System.out.println(lucky13(new int[] { 0, 2, 4 }));
        System.out.println(lucky13(new int[] { 1, 2, 3 }));
        System.out.println(lucky13(new int[] { 1, 2, 4}));
    }

    public static boolean lucky13(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1 || nums[i] == 3) {
                return false;
            }
        }
        return true;
    }
}
