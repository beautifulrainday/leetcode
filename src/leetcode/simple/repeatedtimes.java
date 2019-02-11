package leetcode.simple;

import java.util.HashSet;
import java.util.Set;

/**
 * 在大小为 2N 的数组 A 中有 N+1 个不同的元素，其中有一个元素重复了 N 次。
 * 返回重复了 N 次的那个元素。
 * <p>
 * 输入：[1,2,3,3]
 * 输出：3
 * <p>
 * 输入：[2,1,2,5,3,2]
 * 输出：2
 */
public class repeatedtimes {

    public static void main(String[] args) {
        int[] A = {2, 1, 2, 5, 3, 2, 2, 7};
        System.out.print(repeatedNTimes(A));
    }

    public static int repeatedNTimes(int[] A) {
        int temp = A.length / 2;
        int sumSmall = 0;
        int sumBig = 0;
        Set<Integer> set = new HashSet();
        for (int a : A) {
            set.add(a);
            sumBig += a;
        }
        for (int a : set) {
            sumSmall += a;
        }
        return (sumBig - sumSmall) / (temp - 1);
    }
}
