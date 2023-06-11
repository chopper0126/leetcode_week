package leetcode周赛.week335;

public class FindValidSplit_335 {
    public int findValidSplit(int[] nums) {
        //定义求两个数的最大公约数gcd方法，传入val1、val2，返回
        //val1，val2，由数组决定
        int val1=1,val2=1;
        int n = nums.length;
        int minIdx = Integer.MAX_VALUE;
        for(int i = 0;i<n-1;i++){
            val1 *=nums[i];
            for(int j=i+1;j<n;j++){
                //记录val1，val2，gdc
                val2 *= nums[j];
            }
            if(gcd(val1,val2)==1){
                //记录最小下标值
                minIdx = Math.min(minIdx,i);
            }
            val2 = 1;
        }
        return minIdx == Integer.MAX_VALUE ? -1: minIdx;
    }
    private int gcd(int a,int b){
        int r = 1;
        do{
            r = a % b ;
            a = b;
            b = r;
            /*
            辗转相除法
            a对b取余，b赋值给a 余数赋值给b，，直到 b == 0
             */
        }while(b != 0);
        return a;
    }

    public static void main(String[] args) {
        FindValidSplit_335 findValidSplit_335 = new FindValidSplit_335();
        System.out.println(findValidSplit_335.findValidSplit(new int[]{557663,280817,472963,156253,273349,884803,756869,763183,557663,964357,821411,887849}));
    }
}
