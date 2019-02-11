package leetcode.simple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 给定一个非负整数数组 A，返回一个由 A 的所有偶数元素组成的数组，后面跟 A 的所有奇数元素。
 * 你可以返回满足此条件的任何数组作为答案。
 * <p>
 * 输入：[3,1,2,4]
 * 输出：[2,4,3,1]
 * 输出 [4,2,3,1]，[2,4,1,3] 和 [4,2,1,3] 也会被接受。
 */
public class sortArrayByParity {

    public static void main(String[] args) {
        int[] A = {3, 1, 2, 4};
        System.out.print(Arrays.toString(sortArrayByParity(A)));
    }

    public static int[] sortArrayByParity(int[] A) {
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();
        for (int a : A) {
            if (a % 2 == 0) {
                even.add(a);
            } else {
                odd.add(a);
            }
        }
        even.addAll(odd);
        int[] result = new int[even.size()];
        for (int i = 0; i < even.size(); i++) {
            result[i] = even.get(i);
        }
        return result;
    }

}
