package leetcode.simple;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 给定一个正整数，输出它的补数。补数是对该数的二进制表示取反。
 * 注意:
 * <p>
 * 给定的整数保证在32位带符号整数的范围内。
 * 你可以假定二进制数不包含前导零位。
 * 示例 1:
 * <p>
 * 输入: 5
 * 输出: 2
 * 解释: 5的二进制表示为101（没有前导零位），其补数为010。所以你需要输出2。
 * 示例 2:
 * <p>
 * 输入: 1
 * 输出: 0
 * 解释: 1的二进制表示为1（没有前导零位），其补数为0。所以你需要输出0。
 */
public class FindComplement {

    public static int findComplement(int num) {
        char[] res = Integer.toBinaryString(num).toCharArray();
        List<String> stringList = new ArrayList<>(res.length);
        for (int i = 0; i < res.length; i++) {
            if ((res[i] + "").equalsIgnoreCase("0")) {
                stringList.add("1");
            } else
                stringList.add("0");
        }
        int sum = 0;
        Collections.reverse(stringList);
        for (int i = 0; i < stringList.size(); i++) {
            if (stringList.get(i).equalsIgnoreCase("1")) {
                sum = sum + new Double(Math.pow(2, i)).intValue();
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(findComplement(2));
    }
}
