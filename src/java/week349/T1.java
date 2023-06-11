package week349;

import java.util.Arrays;

public class T1 {
    public static void main(String[] args) {
        System.out.println(findNonMinOrMax(new int[]{2, 1, 3, 4}));
    }
    public static int findNonMinOrMax(int[] nums) {
        int n = nums.length;
        if (n <= 2) return -1;
        Arrays.sort(nums);
        return nums[1];
    }
}
