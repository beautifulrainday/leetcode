package leetcode.medium;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

//你的面前有一堵矩形的、由 n 行砖块组成的砖墙。这些砖块高度相同（也就是一个单位高）但是宽度不同。每一行砖块的宽度之和应该相等。
//
// 你现在要画一条 自顶向下 的、穿过 最少 砖块的垂线。如果你画的线只是从砖块的边缘经过，就不算穿过这块砖。你不能沿着墙的两个垂直边缘之一画线，这样显然是没
//有穿过一块砖的。
//
// 给你一个二维数组 wall ，该数组包含这堵墙的相关信息。其中，wall[i] 是一个代表从左至右每块砖的宽度的数组。你需要找出怎样画才能使这条线 穿过的
//砖块数量最少 ，并且返回 穿过的砖块数量 。
//
//
//
// 示例 1：
//
//
//输入：wall = [[1,2,2,1],[3,1,2],[1,3,2],[2,4],[3,1,2],[1,3,1,1]]
//输出：2
//
//
// 示例 2：
//
//
//输入：wall = [[1],[1],[1]]
//输出：3
//
//
//
// 提示：
//
//
// n == wall.length
// 1 <= n <= 104
// 1 <= wall[i].length <= 104
// 1 <= sum(wall[i].length) <= 2 * 104
// 对于每一行 i ，sum(wall[i]) 应当是相同的
// 1 <= wall[i][j] <= 231 - 1
//
// Related Topics 哈希表
// 👍 173 👎 0
public class LeastBricks {

    public static int leastBricks(List<List<Integer>> wall) {
        //记录所有缝隙的和
        Map<Integer, Integer> map = new HashMap();
        for (int i = 0; i < wall.size(); i++) {
            List<Integer> rowList = wall.get(i);
            //去掉两边的两条
            int tempVal = 0;
            for (int j = 0; j < rowList.size() - 1; j++) {
                tempVal += rowList.get(j);
                if (!map.containsKey(tempVal)) {
                    map.put(tempVal, 1);
                } else {
                    map.put(tempVal, map.get(tempVal) + 1);
                }
            }
        }
        //找到map缝隙和里最大的值
        int maxVal = 0;
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            if (e.getValue() > maxVal) {
                maxVal = e.getValue();
            }
        }
        return wall.size() - maxVal;
    }

    public static void main(String[] args) {
        //System.out.println(leastBricks());
    }
}
