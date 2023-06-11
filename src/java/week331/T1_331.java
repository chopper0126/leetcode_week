package week331;

import java.util.PriorityQueue;

/**
 * 思路：外for循环遍历找最大的数，并记录下标，将最大的数开平方，重新写入数组，while循环k次，循环结束后再将数组所有元素求和赋值给res，并返回
 *
 */
public class T1_331 {
    public long pickGifts(int[] gifts, int k) {
        long res = 0L;
        int max = 0;
        int maxIndex = -1;
        while (k-->0) {
//        for循环遍历找最大的数
            for (int i = 0; i < gifts.length; i++) {
                if (gifts[i] > max) {
                    max = gifts[i];
                    maxIndex = i;
                }
            }
            gifts[maxIndex] = (int) Math.sqrt(gifts[maxIndex]);
            max=0;
            maxIndex =-1;
        }
        for (int gift : gifts) {
            res += gift;
        }
        return res;
    }

    /**
     * 优先队列，始终按照一定顺序排列
     * @param gifts
     * @param k
     * @return long
     */
    public long pickGifts2(int[] gifts, int k) {
        PriorityQueue<Integer> queue=new PriorityQueue<>((a, b)->b-a);//降序排列
        for(int i:gifts)queue.offer(i);
        for(int i=1;i<=k;i++){
            int temp=queue.poll();
            temp=(int)Math.sqrt(temp);
            queue.offer(temp);
        }
        long ans=0;
        for(int i:queue)ans+=i;
        return ans;
    }

    /**
     * 977. 有序数组的平方
     *  优先队列
     * @param nums
     * @return int[]
     */
    public int[] sortedSquares(int[] nums) {
        PriorityQueue<Integer> queue = new PriorityQueue<>((a, b)->a-b);
        for (int i=0;i<nums.length;i++){
             nums[i] = (int) Math.pow(nums[i],2);
        }
        for(int i:nums) queue.offer(i);
        int[] ans = new int[nums.length];
        for (int i=0;i<nums.length;i++){
            ans[i] = queue.poll();
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(5/8);
    }

}
