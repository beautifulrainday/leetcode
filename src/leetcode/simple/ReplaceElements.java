package leetcode.simple;

import java.util.Arrays;

/**
 * 给你一个数组 arr ，请你将每个元素用它右边最大的元素替换，如果是最后一个元素，用 -1 替换。
 * <p>
 * 完成所有替换操作后，请你返回这个数组。
 * <p>
 * 示例：
 * <p>
 * 输入：arr = [17,18,5,4,6,1]
 * 输出：[18,6,6,6,1,-1]
 *  
 * <p>
 * 提示：
 * <p>
 * 1 <= arr.length <= 10^4
 * 1 <= arr[i] <= 10^5
 */
public class ReplaceElements {

    public static int[] replaceElements(int[] arr) {
        int arrLength = arr.length;
        int arr2[] = new int[arrLength];
        System.arraycopy(arr, 0, arr2, 0, arrLength);
        for (int i = 0; i < arrLength; i++) {
            if (i == arrLength - 1) {
                arr[i] = -1;
                break;
            }
            int startPosition = i + 1;
            int tempBiggest = arr2[startPosition];
            for (int j = startPosition + 1; j < arr2.length; j++) {
                if (arr2[j] > tempBiggest) {
                    tempBiggest = arr2[j];
                }
            }
            arr[i] = tempBiggest;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {17, 18, 5, 4, 6, 1};
        arr = replaceElements(arr);
        System.out.println(Arrays.toString(arr));
    }
}
