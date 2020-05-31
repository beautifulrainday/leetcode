package leetcode.simple;

import java.util.HashSet;
import java.util.Set;

/**
 * 实现一个算法，确定一个字符串 s 的所有字符是否全都不同。
 * <p>
 * 示例 1：
 * <p>
 * 输入: s = "leetcode"
 * 输出: false
 * 示例 2：
 * <p>
 * 输入: s = "abc"
 * 输出: true
 */
public class IsUnique {

    public static void main(String[] args) {
        System.out.println(isUnique("leetcode"));
        System.out.println(isUnique("abc"));
    }

    static boolean isUnique(String astr) {
        Integer total = astr.length();
        Set set = new HashSet();
        for (int i = 0; i < total; i++) {
            set.add(astr.charAt(i));
        }
        return total == set.size();
    }
}
