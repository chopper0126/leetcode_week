package week349;

import java.util.Arrays;
/**
 *
 * @description: 6470. 既不是最小值也不是最大值
 *                 思路：1.排序后返回第二个数就行
 *                      2.如果n <= 2 ,返回-1
 * @param: null
 * @return:
 * @author chopper
 * @date: 2023/6/12 9:45
 */
public class T1 {
    public static void main(String[] args) {
        System.out.println(findNonMinOrMax(new int[]{2, 1, 3, 4}));
    }
    /**
     *
     * @description: 6470. 既不是最小值也不是最大值
     *                 思路：1.排序后返回第二个数就行
     *                      2.如果n <= 2 ,返回-1
     * @param: nums
     * @return: int
     * @author chopper
     * @date: 2023/6/12 9:45
     */
    public static int findNonMinOrMax(int[] nums) {
        int n = nums.length;
        if (n <= 2) return -1;
        Arrays.sort(nums);
        return nums[1];
    }
}
