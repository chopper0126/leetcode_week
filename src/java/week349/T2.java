package week349;


import java.util.LinkedList;
import java.util.Queue;

public class T2 {
    public static void main(String[] args) {
        System.out.println(smallestString("a"));
    }
    //输入：s = "cbabc"
    //输出："baabc"
    //输入：s = "acbbc"
    //输出："abaab"
    //输入：s = "leetcode"
    //输出："kddsbncd"
    //输入：s = "aabfcadd"
    //输出："aaaebadd"
    public static String smallestString(String s) {
        //如果第一个字母不是a，那么start = 0，end = a 的下标
        //如果第一个字母是a，那么start = 不是a的第一个下标，end = 下一个a出现的下标

        Queue<Character> que = new LinkedList<>();


        char[] ch = s.toCharArray();


        for (int i = 0; i < ch.length; i++) {
            if(ch[i] != 'a'){
                ch[i] = (char) (ch[i] - 1);
                que.offer(ch[i]);
            }
            if (!que.isEmpty() && ch[i] == 'a'){
                break;
            }
        }
        if (que.isEmpty()){
            return s.substring(0,s.length()-1) + 'z';
        }
        StringBuilder ans = new StringBuilder();
        for (char c : ch) ans.append(c);
        return ans.toString();
    }
}
