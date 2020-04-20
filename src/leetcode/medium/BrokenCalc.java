package leetcode.medium;

/**
 * 在显示着数字的坏计算器上，我们可以执行以下两种操作：
 * <p>
 * 双倍（Double）：将显示屏上的数字乘 2；
 * 递减（Decrement）：将显示屏上的数字减 1 。
 * 最初，计算器显示数字 X。
 * <p>
 * 返回显示数字 Y 所需的最小操作数。
 * <p>
 * 示例 1：
 * <p>
 * 输入：X = 2, Y = 3
 * 输出：2
 * 解释：先进行双倍运算，然后再进行递减运算 {2 -> 4 -> 3}.
 * 示例 2：
 * <p>
 * 输入：X = 5, Y = 8
 * 输出：2
 * 解释：先递减，再双倍 {5 -> 4 -> 8}.
 * 示例 3：
 * <p>
 * 输入：X = 3, Y = 10
 * 输出：3
 * 解释：先双倍，然后递减，再双倍 {3 -> 6 -> 5 -> 10}.
 * 示例 4：
 * <p>
 * 输入：X = 1024, Y = 1
 * 输出：1023
 * 解释：执行递减运算 1023 次
 */
public class BrokenCalc {

    public static int brokenCalc(int X, int Y) {

        return 1;
    }

    public static void main(String[] args) {
        System.out.println(brokenCalc(5, 8));
    }
}
