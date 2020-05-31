package leetcode.simple;

/**
 * 给你两个整数数组 nums 和 index。你需要按照以下规则创建目标数组：
 * <p>
 * 目标数组 target 最初为空。
 * 按从左到右的顺序依次读取 nums[i] 和 index[i]，在 target 数组中的下标 index[i] 处插入值 nums[i] 。
 * 重复上一步，直到在 nums 和 index 中都没有要读取的元素。
 * 请你返回目标数组。
 * <p>
 * 题目保证数字插入位置总是存在。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：nums = [0,1,2,3,4], index = [0,1,2,2,1]
 * 输出：[0,4,1,3,2]
 * 解释：
 * nums       index     target
 * 0            0        [0]
 * 1            1        [0,1]
 * 2            2        [0,1,2]
 * 3            2        [0,1,3,2]
 * 4            1        [0,4,1,3,2]
 */
public class CreateTargetArray {

    public static void main(String[] args) {
        int[] res = createTargetArray(new int[]{0, 1, 2, 3, 4}, new int[]{0, 1, 2, 2, 1});
        System.out.println(res);
    }

    static int[] createTargetArray(int[] nums, int[] index) {
        Integer length = nums.length;
        int[] res = new int[length];
        for (int i = 0; i < res.length; i++) {
            res[i] = -1;
        }
        for (int i = 0; i < res.length; i++) {
            int insertPosition = index[i];
            int insertValue = nums[i];
            int nowValue = res[insertPosition];
            if (nowValue != -1) {
                for (int j = length - 1; j > insertPosition; j--) {
                    res[j] = res[j - 1];
                }
            }
            res[insertPosition] = insertValue;
        }
        return res;
    }
}
