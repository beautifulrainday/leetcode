package leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 数字 n 代表生成括号的对数，请你设计一个函数，用于能够生成所有可能的并且 有效的 括号组合。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：n = 3
 * 输出：["((()))","(()())","(())()","()(())","()()()"]
 * 示例 2：
 * <p>
 * 输入：n = 1
 * 输出：["()"]
 *  
 * <p>
 * 提示：
 * <p>
 * 1 <= n <= 8
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/generate-parentheses
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class GenerateParenthesis {

    public static void main(String[] args) {
        generateParenthesis(3);
        System.out.println(Arrays.toString(strings.toArray()));
    }


    static List<String> strings = new ArrayList<>();

    public static void generateParenthesis(int n) {
        dfs("", n, 0, 0);
    }

    static void dfs(String info, int n, int leftNum, int rightNum) {
        //if (leftNum == n && rightNum == n) {
        if (info.length() == n * 2) {
            System.out.println(info);
            strings.add(info);
        } else {
            if (leftNum < rightNum) {
                return;
            }
            if (leftNum < n) {
                dfs(info.concat("("), n, leftNum + 1, rightNum);
            }
            if (rightNum < n) {
                dfs(info.concat(")"), n, leftNum, rightNum + 1);
            }

        }
    }
}
