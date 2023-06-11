package leetcode周赛.week346;

public class T2 {
    public static void main(String[] args) {
        System.out.println(makeSmallestPalindrome("seven"));
    }
    public static String makeSmallestPalindrome(String s) {
        int n = s.length();
        char[] chars = s.toCharArray();
        int l = 0,r = n-1;
        while (l < r){
            if(chars[l] >= chars[r]){
                chars[l] = chars[r];
            }else {
                chars[r] = chars[l];
            }
            l++;
            r--;
        }
        String ans = "";
        for (char c:chars) {
            ans +=c;
        }
        return ans;
    }
}
