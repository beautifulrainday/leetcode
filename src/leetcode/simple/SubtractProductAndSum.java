package leetcode.simple;

import java.util.ArrayList;
import java.util.List;

/**
 * 给你一个整数 n，请你帮忙计算并返回该整数「各位数字之积」与「各位数字之和」的差。
 * <p>
 * 示例 1：
 * <p>
 * 输入：n = 234
 * 输出：15
 * 解释：
 * 各位数之积 = 2 * 3 * 4 = 24
 * 各位数之和 = 2 + 3 + 4 = 9
 * 结果 = 24 - 9 = 15
 * 示例 2：
 * <p>
 * 输入：n = 4421
 * 输出：21
 * 解释：
 * 各位数之积 = 4 * 4 * 2 * 1 = 32
 * 各位数之和 = 4 + 4 + 2 + 1 = 11
 * 结果 = 32 - 11 = 21
 */
public class SubtractProductAndSum {

    public static int subtractProductAndSum(int n) {
        List<Integer> numList = new ArrayList<>();
        while (n != 0) {
            numList.add(n % 10);
            n = n / 10;
        }
        int sum = 0;
        int product = 1;
        for (int i = 0; i < numList.size(); i++) {
            sum += numList.get(i);
            product *= numList.get(i);
        }
        return product - sum;
    }

    public static void main(String[] args) {
        System.out.println(subtractProductAndSum(234));
    }

}
