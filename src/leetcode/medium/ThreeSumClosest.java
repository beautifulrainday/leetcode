package leetcode.medium;

import java.util.Arrays;

/**
 * 给你一个长度为 n 的整数数组 nums 和 一个目标值 target。请你从 nums 中选出三个整数，使它们的和与 target 最接近。
 * <p>
 * 返回这三个数的和。
 * <p>
 * 假定每组输入只存在恰好一个解。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：nums = [-1,2,1,-4], target = 1
 * 输出：2
 * 解释：与 target 最接近的和是 2 (-1 + 2 + 1 = 2) 。
 * 示例 2：
 * <p>
 * 输入：nums = [0,0,0], target = 1
 * 输出：0
 *  
 * <p>
 * 提示：
 * <p>
 * 3 <= nums.length <= 1000
 * -1000 <= nums[i] <= 1000
 * -104 <= target <= 104
 * <p>
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/3sum-closest
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class ThreeSumClosest {

    public static void main(String[] args) {
        int[] arr = new int[]{-1,2,1,-4};
        System.out.println(threeSumClosest(arr, -1));
    }

    public static int threeSumClosest(int[] nums, int target) {
        int res = -1;
        Arrays.sort(nums);
        int absDiff = Integer.MAX_VALUE;
        int left;
        int right;
        for (int i = 0; i < nums.length; i++) {
            left = i + 1;
            right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                //和目标值的距离
                int _absDiff = Math.abs(target - sum);
                if (_absDiff < absDiff) {
                    //更新为最小
                    absDiff = _absDiff;
                    //记录这三个数字的和
                    res = sum;
                }
                //如果sum大于target，尝试减小，由于是asc排序的，right--;反之left++;==都行
                if (sum >= target) {
                    right--;
                } else {
                    left++;
                }
            }
        }
        return res;
    }
}
