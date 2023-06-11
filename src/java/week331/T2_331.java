package week331;

import java.util.HashSet;

public class T2_331 {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int[] res = new int[queries.length];
        int[] list = new int[words.length];
        //建立元音字母表hashset
        HashSet<Character> hashSet = new HashSet<>();
        hashSet.add('a');
        hashSet.add('e');
        hashSet.add('i');
        hashSet.add('o');
        hashSet.add('u');
//        hashSet.contains(words[i].charAt(words[i].length()-1))

        //判断是元婴字母,生成list【0,1...】
        int count =0;
        for (int i=0;i<words.length;i++){
            if (hashSet.contains(words[i].charAt(words[i].length()-1))
            && hashSet.contains(words[i].charAt(0))){//首位都是元音
                list[i]=1;
                count++;
            }else {
                list[i]=0;
            }
        }
        if (count!=0) {
            //找下表，并求和
            int sum = 0;
            for (int i = 0; i < queries.length; i++) {
                int startIndex = queries[i][0];
                int endIndex = queries[i][1];
                for (int j = startIndex; j <= endIndex; j++) {
                    sum+= list[j];
                }
                res[i] = sum;
                sum = 0;
            }
            return res;
        }else {
            return new int[queries.length];
        }
    }

    public int[] vowelStrings2(String[] words, int[][] queries) {
        int[] res = new int[queries.length];
        int[] list = new int[words.length + 1];//前缀表
        //建立元音字母表hashset
        HashSet<Character> hashSet = new HashSet<>();
        hashSet.add('a');
        hashSet.add('e');
        hashSet.add('i');
        hashSet.add('o');
        hashSet.add('u');

        //判断是元婴字母,生成list 前缀表
        for (int i = 0; i < words.length; i++) {
            if (hashSet.contains(words[i].charAt(words[i].length() - 1))
                    && hashSet.contains(words[i].charAt(0))) {//首位都是元音
                list[i + 1] = list[i] + 1;
            } else {
                list[i+1] = list[i];
            }
        }
        //找下表，并求和

        for (int i = 0; i < queries.length; i++) {
            res[i] = list[queries[i][1]+1]-list[queries[i][0]];
        }
        return res;
    }
}
