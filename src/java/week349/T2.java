package week349;


import java.util.LinkedList;
import java.util.Queue;
/**
*
 * @description: 6465. 执行子串操作后的字典序最小字符串
 *                  1.恰好执行一次，字典序最小
 *                  2.时间复杂度O(N)
 * @param: null
 * @return:
 * @author chopper
 * @date: 2023/6/12 9:35
 */
public class T2 {
    public static void main(String[] args) {
        System.out.println(smallestString("acbbc"));
    }
    /*输入：s = "cbabc"
    输出："baabc"
    输入：s = "acbbc"
    输出："abaab"
    输入：s = "leetcode"
    输出："kddsbncd"
    输入：s = "aabfcadd"
    输出："aaaebadd"*/
    /**
    *
     * @description: 6465. 执行子串操作后的字典序最小字符串
     *                   1.恰好执行一次，字典序最小
     *                   2.时间复杂度O(N)
     * @param: s
     * @return: java.lang.String
     * @author chopper
     * @date: 2023/6/12 9:37
     */
    public static String smallestString(String s) {
        /*如果字母不是a，那么就把变换后的修改到数组中，再添加到queue中；
        如果，队列不为空且当前的字符是‘a’说明找到了结尾的‘a’,直接跳出循环
        */
        Queue<Character> que = new LinkedList<>();
        char[] ch = s.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            if (!que.isEmpty() && ch[i] == 'a'){
                break;
            }
            if(ch[i] != 'a'){
                ch[i] = (char) (ch[i] - 1);
                que.offer(ch[i]);
            }
        }
        //特殊情况，只有字符'a',那就把最后一个字符改成‘z’，返回
        if (que.isEmpty()){
            return s.substring(0,s.length()-1) + 'z';
        }
        //将修改后字典序最小的结果又SB接起来
        StringBuilder ans = new StringBuilder();
        for (char c : ch) ans.append(c);
        return ans.toString();
    }
}
