package leetcode.simple;

import java.util.ArrayList;
import java.util.List;

/**
 * 示例 1：
 * 输入："(()())(())"
 * 输出："()()()"
 * 解释：
 * 输入字符串为 "(()())(())"，原语化分解得到 "(()())" + "(())"，
 * 删除每个部分中的最外层括号后得到 "()()" + "()" = "()()()"。
 * <p>
 * 示例 2：
 * 输入："(()())(())(()(()))"
 * 输出："()()()()(())"
 * 解释：
 * 输入字符串为 "(()())(())(()(()))"，原语化分解得到 "(()())" + "(())" + "(()(()))"，
 * 删除每隔部分中的最外层括号后得到 "()()" + "()" + "()(())" = "()()()()(())"。
 * <p>
 * 示例 3：
 * 输入："()()"
 * 输出：""
 * 解释：
 * 输入字符串为 "()()"，原语化分解得到 "()" + "()"，
 * 删除每个部分中的最外层括号后得到 "" + "" = ""。
 */
public class RemoveOuterParentheses {

    public static void main(String[] args) {
        String s = "(()())(())";//(()()())(())(()(()))
        System.out.println(removeOuterParentheses(s));
    }

    public static String removeOuterParentheses(String S) {
        int leftNum = 0;
        int rightNum = 0;
        List<String> strs = new ArrayList<>();
        int start = -1;
        String res = "";
        for (int i = 0; i < S.length(); i++) {
            strs.add(S.charAt(i) + "");
        }
        for (int i = 0; i < strs.size(); i++) {
            if (strs.get(i).equalsIgnoreCase("(")) {
                if (-1 == start) {
                    start = i;
                }
                leftNum += 1;
            } else if (strs.get(i).equalsIgnoreCase(")")) {
                rightNum += 1;
            }
            if (leftNum >= 1 && rightNum >= 1 && leftNum == rightNum) {//4
                strs.remove(start);
                i--;
                strs.remove(i);
                i--;
                start = -1;
                leftNum = 0;
                rightNum = 0;
            }
        }
        for (String ss : strs) {
            res += ss;
        }
        return res;
    }
}
