package sort;

import java.util.Arrays;

/**
 * 选择排序
 * 每次内层循环记录最大/最小值下标和值，放到外层循环到到下标处
 */
public class SelectSort {

    public static void main(String[] args) {
        Integer[] arr = {2, 3, 33, 111, 34, 67, 55};
        System.out.println(Arrays.toString(arr));
        selectSortAsc(arr);
        System.out.println(Arrays.toString(arr));
        selectSortDesc(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void selectSortAsc(Integer[] arr) {
        for (int i = 0; i < arr.length; i++) {
            //第i轮比较最小值的下标
            int minIndex = i;
            //第i轮比较最小值
            int min = arr[minIndex];
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            arr[i] = arr[minIndex];
            arr[minIndex] = min;
        }
    }

    private static void selectSortDesc(Integer[] arr) {
        for (int i = 0; i < arr.length; i++) {
            //第i轮比较最大值的下标
            int maxIndex = i;
            //第i轮比较最小大值
            int max = arr[maxIndex];
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }
            arr[i] = arr[maxIndex];
            arr[maxIndex] = max;
        }
    }
}
