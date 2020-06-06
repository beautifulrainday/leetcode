package leetcode.hard;

import java.util.HashSet;
import java.util.Set;

/**
 * 给定一个未排序的整数数组，找出最长连续序列的长度。
 * <p>
 * 要求算法的时间复杂度为 O(n)。
 * <p>
 * 示例:
 * <p>
 * 输入: [100, 4, 200, 1, 3, 2]
 * 输出: 4
 * 解释: 最长连续序列是 [1, 2, 3, 4]。它的长度为 4。
 */
public class LongestConsecutive {

    public static void main(String[] args) {
        //System.out.println(longestConsecutive(new int[]{100, 4, 200, 1, 3, 2}));
        System.out.println(longestConsecutive(new int[]{-1, 1, 0}));
    }

    public static int longestConsecutive(int[] nums) {
        Integer maxLng = 0;
        Set<Integer> set = new HashSet();
        for (int num : nums) {
            set.add(num);
        }
        for (Integer i = 0; i < nums.length; i++) {
            Integer cur = nums[i];
            Integer min = cur - 1;
            Integer max = cur + 1;
            if (set.isEmpty()) {
                break;
            }
            set.remove(cur);
            Integer nowLng = 1;
            while (set.contains(min)) {
                set.remove(min);
                nowLng += 1;
                --min;
            }
            while (set.contains(max)) {
                set.remove(max);
                nowLng += 1;
                ++max;
            }
            if (nowLng > maxLng) {
                maxLng = nowLng;
            }
        }
        return maxLng;
    }
}
