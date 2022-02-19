package sort;

import java.util.Arrays;

/**
 * 插入排序
 * 将0-1 0-2 0-3 。。。 逐步排成有序
 */
public class InsertSort {

    public static void main(String[] args) {
        Integer[] arr = {2, 3, 33, 111, 34, 67, 55};
        System.out.println(Arrays.toString(arr));
        insertSortAsc(arr);
        System.out.println(Arrays.toString(arr));
        insertSortDesc(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void insertSortAsc(Integer[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }

    private static void insertSortDesc(Integer[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] > arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }
}
