package leetcode.simple;

/**
 * 两个整数之间的汉明距离指的是这两个数字对应二进制位不同的位置的数目。
 * 给出两个整数 x 和 y，计算它们之间的汉明距离。
 */
public class HammingDistance {
    public static void main(String[] args) {
        System.out.println(hammingDistance(1, 2));
    }

    public static int hammingDistance(int x, int y) {
        int count = 0;
        String r = Integer.toBinaryString(x ^ y);
        for (int i = 0; i < r.length(); i++) {
            char ch = r.charAt(i);
            if ("1".equals(ch + "")) {
                count++;
            }
        }
        return count;
    }
}
