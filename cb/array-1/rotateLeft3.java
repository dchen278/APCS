public class rotateLeft3 {
    public static void main(String[] args) {
        System.out.println(rotateLeft3(new int[] { 1, 2, 3 }));
        System.out.println(rotateLeft3(new int[] { 5, 11, 9 }));
        System.out.println(rotateLeft3(new int[] { 7, 0, 0 }));

    }

    public static int[] rotateLeft3(int[] nums) {
        int[] newNums = new int[3];
        newNums[0] = nums[1];
        newNums[1] = nums[2];
        newNums[2] = nums[0];
        return newNums;
    }
 }
