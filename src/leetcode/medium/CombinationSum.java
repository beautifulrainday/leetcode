package leetcode.medium;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 给你一个 无重复元素 的整数数组 candidates 和一个目标整数 target ，找出 candidates 中可以使数字和为目标数 target 的 所有 不同组合 ，并以列表形式返回。你可以按 任意顺序 返回这些组合。
 * <p>
 * candidates 中的 同一个 数字可以 无限制重复被选取 。如果至少一个数字的被选数量不同，则两种组合是不同的。 
 * <p>
 * 对于给定的输入，保证和为 target 的不同组合数少于 150 个。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：candidates = [2,3,6,7], target = 7
 * 输出：[[2,2,3],[7]]
 * 解释：
 * 2 和 3 可以形成一组候选，2 + 2 + 3 = 7 。注意 2 可以使用多次。
 * 7 也是一个候选， 7 = 7 。
 * 仅有这两种组合。
 * 示例 2：
 * <p>
 * 输入: candidates = [2,3,5], target = 8
 * 输出: [[2,2,2,2],[2,3,3],[3,5]]
 * 示例 3：
 * <p>
 * 输入: candidates = [2], target = 1
 * 输出: []
 *  
 * <p>
 * 提示：
 * <p>
 * 1 <= candidates.length <= 30
 * 1 <= candidates[i] <= 200
 * candidate 中的每个元素都 互不相同
 * 1 <= target <= 500
 * <p>
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/combination-sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class CombinationSum {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        List<List<Integer>> list = combinationSum(new int[]{2, 3, 5}, 8);
        System.out.println(Arrays.toString(list.toArray()));
    }

    private static final List<List<Integer>> res = new ArrayList();
    private static List<Integer> group = new ArrayList();

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        dfs(candidates, target, 0);
        return res;
    }

    private static void dfs(int[] candidates, int target, int start) {
        //递归跳出条件
        //这条路走到半路或结束，已经大于target了，直接结束
        if (target < 0) {
            return;
        }
        //这条路走到半路或结束，已经符合要求了，记录并结束
        if (target == 0) {
            res.add(new ArrayList<>(group));
            return;
        }
        //回溯ing
        for (int i = start; i < candidates.length; i++) {
            group.add(candidates[i]);
            dfs(candidates, target - candidates[i], i);
            //这种情况结束了
            group.remove(group.get(group.size() - 1));
        }
    }
}
