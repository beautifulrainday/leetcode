package sort;

import java.util.Arrays;

/**
 * 快速排序
 * 每一次区间内比较，把（如果）左侧的值作为基准值，放到（正序的话）左边都小于它，右边都大于它的位置上
 * 每次都会有新的区间，递归它直到传入的left和right相遇
 * ps：如果正序、基准值为数组第一位则从右边开始比较，否则会出问题
 */
public class QuickSort {

    public static void main(String[] args) {
        Integer[] arr = {44, 3, 33, 111, 34, 67, 55};
        System.out.println(Arrays.toString(arr));
        quickSortAsc(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
        quickSortDesc(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    private static void quickSortAsc(Integer[] arr, int left, int right) {
        if (left > right) {
            return;
        }
        int i = left;
        int j = right;
        int base = arr[left];
        while (i < j) {
            while (i < j && base <= arr[j]) {
                j--;
            }
            while (i < j && base >= arr[i]) {
                i++;
            }
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        //找到对应点位之后，交换和基准点的位置
        arr[left] = arr[i];
        arr[i] = base;
        //继续套娃
        quickSortAsc(arr, left, i - 1);
        quickSortAsc(arr, j + 1, right);
    }

    private static void quickSortDesc(Integer[] arr, int left, int right) {
        System.out.println("left::" + left + "right::" + right);
        if (left > right) {
            return;
        }
        int i = left;
        int j = right;
        int base = arr[left];
        while (i < j) {
            while (i < j && base >= arr[j]) {
                j--;
            }
            while (i < j && base <= arr[i]) {
                i++;
            }
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        //找到对应点位之后，交换和基准点的位置
        arr[left] = arr[i];
        arr[i] = base;
        //继续套娃
        quickSortDesc(arr, left, i - 1);
        quickSortDesc(arr, j + 1, right);
    }
}


