package sort;

import java.util.Arrays;

/**
 * 冒泡
 */
public class BubbleSort {

    public static void main(String[] args) {
        Integer[] arr = {2, 3, 33, 111, 34, 67, 55};
        System.out.println(Arrays.toString(arr));
        bubbleSort3(arr);
        System.out.println(Arrays.toString(arr));
    }

    //这种写法外层作为控制次数
    private static void bubbleSort(Integer[] arr) {
        for (int a = 0; a < arr.length - 1; a++) {
            for (int b = 0; b < arr.length - 1 - a; b++) {
                if (arr[b] > arr[b + 1]) {
                    int temp = arr[b];
                    arr[b] = arr[b + 1];
                    arr[b + 1] = temp;
                }
            }
        }
    }

    //正序
    private static void bubbleSort2(Integer[] arr) {
        for (int a = arr.length - 1; a > 0; a--) {
            for (int b = 0; b < a; b++) {
                if (arr[b] > arr[b + 1]) {
                    int temp = arr[b];
                    arr[b] = arr[b + 1];
                    arr[b + 1] = temp;
                }
            }
        }
    }

    //倒序
    private static void bubbleSort3(Integer[] arr) {
        for (int a = 0; a < arr.length; a++) {
            for (int b = arr.length - 1; b > a; b--) {
                if (arr[b] > arr[b - 1]) {
                    int temp = arr[b];
                    arr[b] = arr[b - 1];
                    arr[b-1] = temp;
                }
            }
        }
    }

}