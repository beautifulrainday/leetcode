package leetcode.simple;

import java.util.Arrays;

/**
 * 给定一个按非递减顺序排序的整数数组 A，返回每个数字的平方组成的新数组，要求也按非递减顺序排序。
 * 输入：[-4,-1,0,3,10]
 * 输出：[0,1,9,16,100]
 * <p>
 * 输入：[-7,-3,2,3,11]
 * 输出：[4,9,9,49,121]
 */
public class SortedSquares {
    public static void main(String[] args) {
        int[] A = {-7, -3, 2, 3, 11};
        System.out.println(Arrays.toString(getSortedSquares(A)));
    }

    public static int[] getSortedSquares(int[] A) {
        /*List<Integer> integerList = new ArrayList<>();
        for(int i:A){
            i = i*i;
            integerList.add(i);
        }
        for(int i=0;i<integerList.size()-1;i++){
            for(int j=0;j<integerList.size()-i-1;j++){
                if(integerList.get(j)>integerList.get(j+1)){
                    int temp = integerList.get(j);
                    integerList.set(j,integerList.get(j+1));
                    integerList.set(j+1,temp);
                }
            }
        }
        int[] result = new int[integerList.size()];
        for(int i=0;i<result.length;i++){
            result[i] = integerList.get(i);
        }*/
        for (int i = 0; i < A.length; i++) {
            A[i] = A[i] * A[i];
        }
        Arrays.sort(A);
        return A;
    }
}
