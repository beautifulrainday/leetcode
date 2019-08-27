package leetcode.simple;

/**
 * 给定一个包含 0, 1, 2, ..., n 中 n 个数的序列，找出 0 .. n 中没有出现在序列中的那个数。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [3,0,1]
 * 输出: 2
 * 示例 2:
 * <p>
 * 输入: [9,6,4,2,3,5,7,0,1]
 * 输出: 8
 */
public class MissingNumber {

    public static int missingNumber(int[] nums) {
        int afterLostSum = 0;
        for (int i = 0; i < nums.length; i++) {
            afterLostSum += nums[i];
        }
        return nums.length * (nums.length + 1) / 2 - afterLostSum;
    }

    public static void main(String[] args) {
        int[] array = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        //int[] array = {1};
        System.out.println(missingNumber(array));
    }
}
