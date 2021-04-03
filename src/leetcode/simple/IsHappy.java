package leetcode.simple;

import java.util.HashSet;
import java.util.Set;

//编写一个算法来判断一个数 n 是不是快乐数。
//
// 「快乐数」定义为：
//
//
// 对于一个正整数，每一次将该数替换为它每个位置上的数字的平方和。
// 然后重复这个过程直到这个数变为 1，也可能是 无限循环 但始终变不到 1。
// 如果 可以变为 1，那么这个数就是快乐数。
//
//
// 如果 n 是快乐数就返回 true ；不是，则返回 false 。
//
//
//
// 示例 1：
//
//
//输入：19
//输出：true
//解释：
//12 + 92 = 82
//82 + 22 = 68
//62 + 82 = 100
//12 + 02 + 02 = 1
//
//
// 示例 2：
//
//
//输入：n = 2
//输出：false
//
//
//
//
// 提示：
//
//
// 1 <= n <= 231 - 1
//
// Related Topics 哈希表 数学
// 👍 569 👎 0
public class IsHappy {

    private static boolean isHappy1(int n) {
        String nStr = String.valueOf(n);
        Integer nowNum = 0;
        Set<Integer> set = new HashSet<>();
        while (true) {
            for (int i = 0; i < nStr.length(); i++) {
                Integer curNum = Integer.parseInt(nStr.charAt(i) + "");
                nowNum += (curNum * curNum);
            }
            if (set.contains(nowNum) || nowNum == 1) {
                break;
            } else {
                set.add(nowNum);
            }
            nStr = String.valueOf(nowNum);
            nowNum = 0;
        }
        return nowNum == 1;
    }

    private static boolean isHappy2(int n) {
        if (n == 1) {
            return true;
        }
        int res = getNext(n);
        if (res == 1) {
            return true;
        }
        int quickPoint = res;
        int slowPoint = n;
        while (quickPoint != slowPoint) {
            quickPoint = getNext(getNext(quickPoint));
            slowPoint = getNext(slowPoint);
        }
        return quickPoint == 1;
    }

    public static int getNext(int n) {
        int totalSum = 0;
        while (n > 0) {
            int d = n % 10;
            n = n / 10;
            totalSum += d * d;
        }
        return totalSum;
    }

    public static void main(String[] args) {
        System.out.println(isHappy2(19));
    }
}
