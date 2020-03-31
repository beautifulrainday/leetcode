package leetcode.simple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * 给你一个整数 n，请你返回 任意 一个由 n 个 各不相同 的整数组成的数组，并且这 n 个数相加和为 0 。
 * <p>
 * 示例 1：
 * <p>
 * 输入：n = 5
 * 输出：[-7,-1,1,3,4]
 * 解释：这些数组也是正确的 [-5,-1,1,2,3]，[-3,-1,2,-2,4]。
 * 示例 2：
 * <p>
 * 输入：n = 3
 * 输出：[-1,0,1]
 * 示例 3：
 * <p>
 * 输入：n = 1
 * 输出：[0]
 * <p>
 * 1 <= n <= 1000
 */
public class SumZero {//6 0-2 3-5

    public static int[] sumZero(int n) {
        int[] arr = new int[n];
        if (n == 1) {
            arr[0] = 0;
        } else {
            if (n % 2 == 0) {
                List<Integer> l = new ArrayList<>(n / 2);
                for (int i = 0; i < n / 2; i++) {
                    int num = new Random().nextInt(1000) + 1;//[1,1001)
                    l.add(num * (-1));
                    arr[i] = num;
                }
                for (int i = n - 1; i >= n / 2; i--) {
                    arr[i] = l.get(i - n / 2);
                }
            } else {
                n = n - 1;
                List<Integer> l = new ArrayList<>(n / 2);
                for (int i = 0; i < n / 2; i++) {
                    int num = new Random().nextInt(1000) + 1;//[1,1001)
                    l.add(num * (-1));
                    arr[i] = num;
                }
                for (int i = n - 1; i >= n / 2; i--) {
                    arr[i] = l.get(i - n / 2);
                }
                arr[n] = 0;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sumZero(11)));
    }
}
