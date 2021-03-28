package leetcode.simple;

//给定两个数组，编写一个函数来计算它们的交集。
//
//
//
// 示例 1：
//
// 输入：nums1 = [1,2,2,1], nums2 = [2,2]
//输出：[2,2]
//
//
// 示例 2:
//
// 输入：nums1 = [4,9,5], nums2 = [9,4,9,8,4]
//输出：[4,9]
//
//
//
// 说明：
//
//
// 输出结果中每个元素出现的次数，应与元素在两个数组中出现次数的最小值一致。
// 我们可以不考虑输出结果的顺序。
//
//
// 进阶：
//
//
// 如果给定的数组已经排好序呢？你将如何优化你的算法？
// 如果 nums1 的大小比 nums2 小很多，哪种方法更优？
// 如果 nums2 的元素存储在磁盘上，内存是有限的，并且你不能一次加载所有的元素到内存中，你该怎么办？
//
// Related Topics 排序 哈希表 双指针 二分查找
// 👍 467 👎 0

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Intersect {

    public static int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> resList = new ArrayList();
        for (int num : nums1) {
            list.add(num);
        }
        for (int num : nums2) {
            list2.add(num);
        }
        for (int i = 0; i < list2.size(); i++) {
            int curNum = list2.get(i);
            if (list.contains(curNum)) {
                resList.add(curNum);
                list.remove(list.indexOf(curNum));
                list2.remove(i);
                i--;
            }
        }
        int[] resArr = new int[resList.size()];
        int index = 0;
        for (int num : resList) {
            resArr[index] = num;
            index++;
        }
        return resArr;
    }

    public static void main(String[] args) {
        int[] a1 = {1, 2, 2, 1};
        int[] a2 = {2, 2};
        int[] arr = intersect(a1, a2);
        System.out.println(Arrays.toString(arr));
    }
}
