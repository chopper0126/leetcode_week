package week349;

/**
 * @author chopper
 * @version 1.0
 * @description:  2735.收集巧克力
 *
 * @date 2023/6/12 10:13
 */
public class T3 {
    public static void main(String[] args) {
        System.out.println(minCost(new int[]{20, 1, 15}, 5));
    }
    public static long minCost(int[] nums, int x) {
        long ans = Long.MAX_VALUE;
        int n = nums.length;
        //用长度为n的数组，表示操作0-n-1次的成本
        long[] sum = new long[n];
        for (int i = 0; i < n; i++) {
            sum[i] = (long) i * x;
        }
        for (int i = 0; i < n; i++) { // 子数组左端点
            int mn = nums[i];
            for (int j = i; j < n + i; j++) { // 子数组右端点（把数组视作环形的）
                mn = Math.min(mn, nums[j % n]); // 从 nums[i] 到 nums[j%n] 的最小值
                sum[j - i] += mn;// 累加操作 j-i 次的成本
            }
        }
        for(var s : sum) ans = Math.min(ans,s);
        return ans;
    }
}
