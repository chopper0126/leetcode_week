package week350;

import java.util.Arrays;

//6890. 找出分区值
public class T2 {
    public static void main(String[] args) {

        System.out.println(findValueOfPartition(new int[]{78,36,2,70,64,24,34,63,21,49}));
    }
    public static int findValueOfPartition(int[] nums) {
        int ans = Integer.MAX_VALUE;
        Arrays.sort(nums);
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i - 1]) return 0;
            ans = Math.min(ans,Math.abs(nums[i] - nums[i-1]));
        }
        return ans;
    }

}
