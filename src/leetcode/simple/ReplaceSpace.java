package leetcode.simple;

/**
 * 请实现一个函数，把字符串 s 中的每个空格替换成"%20"。
 * <p>
 * 示例 1：
 * <p>
 * 输入：s = "We are happy."
 * 输出："We%20are%20happy."
 */
public class ReplaceSpace {

    public static String replaceSpace(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            Character ch = s.charAt(i);
            String str = ch.toString();
            if (!str.equalsIgnoreCase(" ")) {
                sb.append(str);
            } else {
                sb.append("%20");
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(replaceSpace("We are happy."));
    }
}
