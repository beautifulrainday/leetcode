package leetcode.simple;

import java.util.ArrayList;
import java.util.List;

/**
 * 自除数 是指可以被它包含的每一位数除尽的数。
 * 例如，128 是一个自除数，因为 128 % 1 == 0，128 % 2 == 0，128 % 8 == 0。
 * 还有，自除数不允许包含 0 。
 * 给定上边界和下边界数字，输出一个列表，列表的元素是边界（含边界）内所有的自除数。
 * 示例 1：
 * 输入：
 * 上边界left = 1, 下边界right = 22
 * 输出： [1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22]
 */
public class SelfDividingNumbers {

    public static void main(String[] args) {
        List<Integer> list = selfDividingNumbers(1, 100);
    }

    public static List<Integer> selfDividingNumbers(int left, int right) {
        int count = 0;
        List<Integer> integers = new ArrayList<>();
        for (Integer i = left; i <= right; i++) {
            String s = i.toString();
            for (int j = 0; j < s.length(); j++) {
                Character ch = s.charAt(j);
                if (ch == '0') {
                    count = -1;
                    break;
                } else {
                    int num = Integer.parseInt(ch + "");
                    int returnNum = i % num;
                    if (returnNum != 0) {
                        count++;
                    }
                }
            }
            if (count == 0) {
                integers.add(i);
            }
            count = 0;
        }
        return integers;
    }
}
