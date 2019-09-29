package leetcode.simple;

import java.util.LinkedList;

/**
 * 写一个 RecentCounter 类来计算最近的请求。
 * <p>
 * 它只有一个方法：ping(int t)，其中 t 代表以毫秒为单位的某个时间。
 * <p>
 * 返回从 3000 毫秒前到现在的 ping 数。
 * <p>
 * 任何处于 [t - 3000, t] 时间范围之内的 ping 都将会被计算在内，包括当前（指 t 时刻）的 ping。
 * <p>
 * 保证每次对 ping 的调用都使用比之前更大的 t 值。
 * <p>
 * 示例：
 * <p>
 * 输入：inputs = ["RecentCounter","ping","ping","ping","ping"], inputs = [[],[1],[100],[3001],[3002]]
 * 输出：[null,1,2,3,3]
 */
public class RecentCounter {

    //private static List<Integer> recordList = new ArrayList<>();
    static LinkedList<Integer> list = new LinkedList<>();

    public static int ping(int t) {
        /*if (recordList.size() == 0) {
            recordList.add(t);
            return 1;
        }
        recordList.add(t);
        for (int i = 0; i < recordList.size(); i++) {
            Integer record = recordList.get(i);
            int passedTime = t - record;
            if (passedTime > 3000) {
                recordList.remove(record);
                i--;
            }
        }
        return recordList.size();*/
        list.add(t);
        while (list.getFirst() < t - 3000)
            list.removeFirst();
        return list.size();
    }

    public static void main(String[] args) {
        for (int i = 0; i <= 4300; i++) {
            if (i == 1178 || i == 1483 || i == 1563 || i == 4054 || i == 4152) {
                System.out.println(ping(i));
            }
        }
    }
}
