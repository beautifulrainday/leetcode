package sort;

import static sort.TestData.numArr;

/**
 * kuaisu
 *
 * https://blog.csdn.net/shujuelin/article/details/82423852
 */
public class QuickSort {

    public static void quickSort(Integer[] originArr, Integer left, Integer right) {
        if (left > right) {
            return;
        }
        int i = left;
        int j = right;
        int base = originArr[left];
        while (i < j) {
            while (base >= originArr[j] && i < j) {
                j--;
            }
            while (base <= originArr[i] && i < j) {
                i++;
            }
            //if (i < j) {
                int temp = originArr[i];
                originArr[i] = originArr[j];
                originArr[j] = temp;
            //}
        }
        originArr[left] = originArr[j];
        originArr[j] = base;
        quickSort(originArr, left, i - 1);
        quickSort(originArr, i + 1, right);
    }

    public static void main(String[] args) {
        for (int i = 0; i < numArr.length; i++) {
            System.out.print(numArr[i] + " ");
        }
        quickSort(numArr, 0, numArr.length - 1);
        for (int i = 0; i < numArr.length; i++) {
            System.out.println(numArr[i] + " ");
        }

    }
}
