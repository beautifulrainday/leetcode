package leetcode.simple;

/**
 * 给你一个字符串 s，它由数字（'0' - '9'）和 '#' 组成。我们希望按下述规则将 s 映射为一些小写英文字符：
 * <p>
 * 字符（'a' - 'i'）分别用（'1' - '9'）表示。
 * 字符（'j' - 'z'）分别用（'10#' - '26#'）表示。 
 * 返回映射之后形成的新字符串。
 * <p>
 * 题目数据保证映射始终唯一。
 * <p>
 * 示例 1：
 * <p>
 * 输入：s = "10#11#12"
 * 输出："jkab"
 * 解释："j" -> "10#" , "k" -> "11#" , "a" -> "1" , "b" -> "2".
 * 示例 2：
 * <p>
 * 输入：s = "1326#"
 * 输出："acz"
 * 示例 3：
 * <p>
 * 输入：s = "25#"
 * 输出："y"
 * 示例 4：
 * <p>
 * 输入：s = "12345678910#11#12#13#14#15#16#17#18#19#20#21#22#23#24#25#26#"
 * 输出："abcdefghijklmnopqrstuvwxyz"
 */
public class FreqAlphabets {

    public static String freqAlphabets(String s) {
        StringBuilder sb = new StringBuilder();
        char[] charArray = s.toCharArray();
        int length = charArray.length;
        for (int i = 0; i < length; ) {
            char c = charArray[i];
            if (i + 2 < length && charArray[i + 2] == '#') {
                sb.append((char) ('a' - 1 + Integer.parseInt(s.substring(i, i + 2))));
                i += 3;
            } else {
                sb.append((char) ('a' - 1 + Integer.parseInt(c + "")));
                i++;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        /*String s = "10#";
        s = s.substring(0,2);
        System.out.println('a' - 1 + Integer.parseInt(s));*/

        System.out.println(freqAlphabets("12345678910#11#12#13#14#15#16#17#18#19#20#21#22#23#24#25#26#"));
    }
}
