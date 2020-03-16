package leetcode.simple;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定两个字符串 s1 和 s2，请编写一个程序，确定其中一个字符串的字符重新排列后，能否变成另一个字符串。
 * <p>
 * 示例 1：
 * <p>
 * 输入: s1 = "abc", s2 = "bca"
 * 输出: true
 * 示例 2：
 * <p>
 * 输入: s1 = "abc", s2 = "bad"
 * 输出: false
 */
public class CheckPermutation {

    public static boolean CheckPermutation(String s1, String s2) {
        int l1 = s1.length();
        int l2 = s2.length();
        if (l1 != l2) {
            return false;
        }
        List<Character> chList = new ArrayList<>();
        for (int i = 0; i < l2; i++) {
            chList.add(s2.charAt(i));
        }
        int count = 0;
        for (int i = 0; i < l1; i++) {
            for (int j = 0; j < chList.size(); j++) {
                Character chj = chList.get(j);
                if (s1.charAt(i) == chj) {
                    chList.remove(chj);
                    count++;
                    break;
                }
            }
        }
        return count == l1;
    }

    public static void main(String[] args) {
        System.out.println(CheckPermutation("abc", "bad"));
    }
}
