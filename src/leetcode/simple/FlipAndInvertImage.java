package leetcode.simple;

import java.util.Arrays;

/**
 * 给定一个二进制矩阵 A，我们想先水平翻转图像，然后反转图像并返回结果。
 * 水平翻转图片就是将图片的每一行都进行翻转，即逆序。例如，水平翻转 [1, 1, 0] 的结果是 [0, 1, 1]。
 * 反转图片的意思是图片中的 0 全部被 1 替换， 1 全部被 0 替换。例如，反转 [0, 1, 1] 的结果是 [1, 0, 0]。
 * <p>
 * 输入: [[1,1,0],[1,0,1],[0,0,0]]
 * 输出: [[1,0,0],[0,1,0],[1,1,1]]
 * 解释: 首先翻转每一行: [[0,1,1],[1,0,1],[0,0,0]]；
 * 然后反转图片: [[1,0,0],[0,1,0],[1,1,1]]
 */
public class FlipAndInvertImage {

    public static void main(String[] args) {
        int[][] A = {{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
        A = flipAndInvertImage(A);
        for (int i = 0; i < A.length; i++) {
            System.out.print(Arrays.toString(A[i]));
        }
    }

    public static int[][] flipAndInvertImage(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            int[] B = new int[A[i].length];
            for (int j = 0; j < A[i].length; j++) {
                B[j] = A[i][A[i].length - j - 1];
            }
            for (int j = 0; j < B.length; j++) {
                if (B[j] == 0) {
                    B[j] = 1;
                } else {
                    B[j] = 0;
                }
            }
            A[i] = B;
        }
        return A;
    }
}