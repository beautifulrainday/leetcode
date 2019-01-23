package leetcode.simple;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定字符串J 代表石头中宝石的类型，和字符串 S代表你拥有的石头。
 * S 中每个字符代表了一种你拥有的石头的类型，你想知道你拥有的石头中有多少是宝石。
 * J 中的字母不重复，J 和 S中的所有字符都是字母。字母区分大小写，因此"a"和"A"是不同类型的石头。
 */
public class JewelAndStone {
    public static int numJewelsInStones(String J, String S) {
        String JJ = J.replace(" ", "");
        String SS = S.replace(" ", "");

        List<String> strs = new ArrayList<>();
        for (int k = 0; k < SS.length(); k++) {
            strs.add(SS.charAt(k) + "");
        }

        int count = 0;
        if (JJ.length() < 51 && strs.size() < 51) {

            for (int j = 0; j < JJ.length(); j++) {
                for (int i = 0; i < strs.size(); i++) {
                    String jtemp = JJ.charAt(j) + "";
                    if (strs.get(i).equals(jtemp)) {
                        count += 1;
                        strs.remove(i);
                        i -= 1;
                    }
                }
            }
            return count;

        }
        return 0;
    }

    public static void main(String[] args) {
        int a = numJewelsInStones("z", "ZZ");
        System.out.println(a);
    }
}
