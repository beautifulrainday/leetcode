//package sort;
//
//import static sort.TestData.numArr;
//
///**
// * maopao
// */
//public class BubbleSort {
//
//    public static Integer[] bubbleSort(Integer[] originArr) {
//        for (int i = 0; i < originArr.length - 1; i++) {
//            for (int j = 0; j < originArr.length - 1 - i; j++) {
//                if (originArr[j] > originArr[j + 1]) {
//                    int tmp = -1;
//                    tmp = originArr[j];
//                    originArr[j] = originArr[j + 1];
//                    originArr[j + 1] = tmp;
//                }
//            }
//        }
//        return originArr;
//    }
//
//    public static void main(String[] args) {
//        for (int i = 0; i < numArr.length; i++) {
//            System.out.print(numArr[i] + " ");
//        }
//        numArr = bubbleSort(numArr);
//        for (int i = 0; i < numArr.length; i++) {
//            System.out.println(numArr[i] + " ");
//        }
//
//    }
//}
