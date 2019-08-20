package leetcode.simple;

/**
 * 我们把符合下列属性的数组 A 称作山脉：
 * A.length >= 3
 * 存在 0 < i < A.length - 1 使得A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1]
 * 给定一个确定为山脉的数组，返回任何满足 A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1] 的 i 的值。
 * <p>
 * 示例 1：
 * <p>
 * 输入：[0,1,0]
 * 输出：1
 * 示例 2：
 * <p>
 * 输入：[0,2,1,0]
 * 输出：1
 */
public class PeakIndexInMountainArray {

    public static int peakIndexInMountainArray(int[] A) {
        int top = 1;
        if (A.length == 3) {
            return 1;
        }
        for (int a = 1; a < A.length - 1; a++) {
            if ((a + 1) == A.length - 1) {
                break;
            }
            if (A[a + 1] > A[a]) {
                top = a + 1;
            }
        }
        return top;
    }

    public static void main(String[] args) {
        int[] arr = {0, 2, 1, 0, 5, 10, 4, 11, 3, 2};
        System.out.println(peakIndexInMountainArray(arr));
    }
}
