package leetcode.simple;


import java.util.Arrays;

/**
 * 学校在拍年度纪念照时，一般要求学生按照 非递减 的高度顺序排列。
 * 请你返回至少有多少个学生没有站在正确位置数量。该人数指的是：能让所有学生以 非递减 高度排列的必要移动人数。
 * <p>
 * 示例：
 * <p>
 * 输入：[1,1,4,2,1,3] 1,1,1,2,3,4
 * 输出：3
 * 解释：
 * 高度为 4、3 和最后一个 1 的学生，没有站在正确的位置。
 */
public class HeightChecker {

    public static int heightChecker(int[] heights) {
        int res = 0;
        int[] oldArray = Arrays.copyOf(heights, heights.length);
        for (int i = 0; i < heights.length - 1; i++) {
            for (int j = 0; j < heights.length - 1 - i; j++) {
                if (heights[j] > heights[j + 1]) {
                    int temp;
                    temp = heights[j];
                    heights[j] = heights[j + 1];
                    heights[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < oldArray.length; i++) {
            if (oldArray[i] != heights[i]) {
                res += 1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] array = {1, 1, 4, 2, 1, 3};
        System.out.println(heightChecker(array));
    }

}
