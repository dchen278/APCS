public class sum3 {
    public static void main(String[] args) {
        System.out.println(sum3(new int[] { 1, 2, 3 }));
        System.out.println(sum3(new int[] { 5, 11, 2 }));
        System.out.println(sum3(new int[] { 7, 0, 0 }));

    }

    public static int sum3(int[] nums) {
        return nums[0] + nums[1] + nums[2];
    }
}
