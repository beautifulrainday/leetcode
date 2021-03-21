package leetcode.simple;

import java.util.Arrays;

//给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
//
// 示例:
//
// 输入: [0,1,0,3,12]4,2,4,0,0,3,0,5,1,0
//输出: [1,3,12,0,0]
//
// 说明:
//
//
// 必须在原数组上操作，不能拷贝额外的数组。
// 尽量减少操作次数。
//
// Related Topics 数组 双指针
// 👍 1001 👎 0
public class MoveZeroes {

    private static void moveZeroes(int[] nums) {
        if (nums == null || nums.length < 2) {
            return;
        }
        int putPos = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[putPos] = nums[i];
                if (putPos != i) {
                    nums[i] = 0;
                }
                putPos++;
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {4, 2, 4, 0, 0, 3, 0, 5, 1, 0};
        moveZeroes(array);
        System.out.println(Arrays.toString(array));
    }
}
