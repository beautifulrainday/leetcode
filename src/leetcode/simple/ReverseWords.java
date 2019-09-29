package leetcode.simple;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 给定一个字符串，你需要反转字符串中每个单词的字符顺序，同时仍保留空格和单词的初始顺序。
 * 示例 1:
 * 输入: "Let's take LeetCode contest"
 * 输出: "s'teL ekat edoCteeL tsetnoc" 
 * 注意：在字符串中，每个单词由单个空格分隔，并且字符串中不会有任何额外的空格。
 */
public class ReverseWords {

    public static String reverseWords(String s) {
        if (s == null || s.equalsIgnoreCase("")) {
            return "";
        }
        String[] array = s.split(" ");
        String res = "";
        for (String ss : array) {
            List<String> StringList = new ArrayList<>();
            char[] charArray = ss.toCharArray();
            for (char ch : charArray) {
                StringList.add(ch + "");
            }
            Collections.reverse(StringList);
            for (int i = 0; i < StringList.size(); i++) {
                if (i == StringList.size() - 1) {
                    res = res.concat(StringList.get(i)).concat(" ");
                } else {
                    res = res.concat(StringList.get(i));
                }
            }
        }
        return res.substring(0, res.length() - 1);
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("Let's take LeetCode contest"));
    }

}
