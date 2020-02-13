package leetcode.simple;

import java.util.ArrayList;
import java.util.List;

/**
 * 字符串的左旋转操作是把字符串前面的若干个字符转移到字符串的尾部。请定义一个函数实现字符串左旋转操作的功能。比如，输入字符串"abcdefg"和数字2，该函数将返回左旋转两位得到的结果"cdefgab"。
 * <p>
 * 示例 1：
 * <p>
 * 输入: s = "abcdefg", k = 2
 * 输出: "cdefgab"
 * 示例 2：
 * <p>
 * 输入: s = "lrloseumgh", k = 6
 * 输出: "umghlrlose"
 * \
 */
public class ReverseLeftWords {

    public static String reverseLeftWords(String s, int n) {
        List<Character> resList = new ArrayList<>();
        for (int i = n; i < s.length(); i++) {
            resList.add(s.charAt(i));
        }
        for (int i = 0; i < n; i++) {
            resList.add(s.charAt(i));
        }
        StringBuilder sb = new StringBuilder(resList.size());
        for (Character r : resList) {
            sb.append(r);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseLeftWords("abcdefg", 2));
    }
}
