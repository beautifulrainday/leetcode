package leetcode.simple;

//给你两个有序整数数组 nums1 和 nums2，请你将 nums2 合并到 nums1 中，使 nums1 成为一个有序数组。
//
// 初始化 nums1 和 nums2 的元素数量分别为 m 和 n 。你可以假设 nums1 的空间大小等于 m + n，这样它就有足够的空间保存来自 nu
//ms2 的元素。
//
//
//
// 示例 1：
//
//
//输入：nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
//输出：[1,2,2,3,5,6]
//
//
// 示例 2：
//
//
//输入：nums1 = [1], m = 1, nums2 = [], n = 0
//输出：[1]
//
//
//
//
// 提示：
//
//
// nums1.length == m + n
// nums2.length == n
// 0 <= m, n <= 200
// 1 <= m + n <= 200
// -109 <= nums1[i], nums2[i] <= 109
//
// Related Topics 数组 双指针
// 👍 941 👎 0
public class Merge {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] arr = new int[m + n];
        int indexLeft = 0;
        int indexRight = 0;
        if (nums1.length == 0 && nums2.length == 0) return;
        if (nums1.length == 0) {
            for (int i = 0; i != m + n; ++i) {
                nums1[i] = nums2[i];
            }
            return;
        }
        if (nums2.length == 0) return;
        for (int i = 0; i < m + n; i++) {
            if (indexRight >= n) {
                arr[i] = nums1[indexLeft];
                indexLeft++;
                continue;
            }
            if (nums1[indexLeft] > nums2[indexRight]) {
                if (indexRight < n) {
                    arr[i] = nums2[indexRight];
                    indexRight++;
                } else {
                    arr[i] = nums1[indexLeft];
                    indexLeft++;
                }

            } else {
                if (indexLeft < m) {
                    arr[i] = nums1[indexLeft];
                    indexLeft++;
                } else {
                    arr[i] = nums2[indexRight];
                    indexRight++;
                }

            }
        }
        for (int i = 0; i != m + n; ++i) {
            nums1[i] = arr[i];
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        merge(nums1, 3, nums2, 3);
        /*int[] nums1 = {2, 0};
        int[] nums2 = {1};
        merge(nums1, 1, nums2, 1);*/
        System.out.println(1);
    }
}
