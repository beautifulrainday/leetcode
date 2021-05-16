package leetcode.medium;

//给定两个整数，被除数 dividend 和除数 divisor。将两数相除，要求不使用乘法、除法和 mod 运算符。
//
// 返回被除数 dividend 除以除数 divisor 得到的商。
//
// 整数除法的结果应当截去（truncate）其小数部分，例如：truncate(8.345) = 8 以及 truncate(-2.7335) = -2
//
//
//
// 示例 1:
//
// 输入: dividend = 10, divisor = 3
//输出: 3
//解释: 10/3 = truncate(3.33333..) = truncate(3) = 3
//
// 示例 2:
//
// 输入: dividend = 7, divisor = -3
//输出: -2
//解释: 7/-3 = truncate(-2.33333..) = -2
//
//
//
// 提示：
//
//
// 被除数和除数均为 32 位有符号整数。
// 除数不为 0。
// 假设我们的环境只能存储 32 位有符号整数，其数值范围是 [−231, 231 − 1]。本题中，如果除法结果溢出，则返回 231 − 1。
//
// Related Topics 数学 二分查找
// 👍 563 👎 0


// 31/3 => 10   28,3/25,6/22,9/19,12/16,15
public class Divide {

    public static int divide(int dividend, int divisor) {
        long dividedl = dividend;
        long divisorl = divisor;
        if (dividedl == Integer.MIN_VALUE && divisorl == -1) return Integer.MAX_VALUE;
        int res = div(Math.abs(dividedl), Math.abs(divisorl));
        return ((dividend > 0 && divisor < 0) || (dividend < 0 && divisor > 0)) ? -res : res;
    }

    private static int div(long big, long small) {
        if (big < small) return 0;
        long div = small;
        int res = 1;
        while (big >= div << 1) {
            div = div << 1;
            res = res << 1;
        }
        return res + div(big - div, small);
    }

    public static int divideSlow(int dividend, int divisor) {
        int res = 0;
        long dividedl = dividend;
        long divisorl = divisor;
        if (dividedl == Integer.MIN_VALUE && divisorl == -1) return Integer.MAX_VALUE;
        long tmpVal = divisorl;//目前的除数值
        try {
            while (Math.abs(dividedl) >= Math.abs(tmpVal)) {
                tmpVal = Math.abs(tmpVal) + Math.abs(divisorl);
                res += 1;
            }
            return ((dividedl > 0 && divisorl < 0) || (dividedl < 0 && divisorl > 0)) ? -(--res) : --res;
        } catch (Exception e) {
            Double d = Math.pow(2, 31) - 1;
            return d.intValue();
        }
    }

    public static void main(String[] args) {
        System.out.println(divide(-2147483648, 1));
        //System.out.println(divide(31, 3));
    }
}
