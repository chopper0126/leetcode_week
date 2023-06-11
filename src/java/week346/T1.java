package leetcode周赛.week346;

import java.util.Stack;

public class T1 {
    public static void main(String[] args) {
        System.out.println(minLength("ACADB"));
    }
    public static int minLength(String s) {
        char[] ch = s.toCharArray();
        Stack<Character> stack = new Stack<Character>();
        stack.push(ch[0]);
        for(int i = 1;i < ch.length;i++){
            if (stack.empty()){
                stack.push(ch[i]);
                continue;
            }
            char ding = stack.peek();
            if((ding == 'A' && ch[i] == 'B') || (ding == 'C' && ch[i] == 'D')){
                stack.pop();
            }else {
                stack.push(ch[i]);
            }
        }
        return stack.size();
    }
}
