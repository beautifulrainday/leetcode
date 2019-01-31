package leetcode.simple;


/**
 * 实现函数 ToLowerCase()，该函数接收一个字符串参数 str，并将该字符串中的大写字母转换成小写字母，之后返回新的字符串。
 * 输入: "Hello"
 * 输出: "hello"
 */
public class LowerCase {

    public static void main(String[] args) {
        System.out.print(toLowerCase("HellozZ"));
    }

    public static String toLowerCase(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            String c = str.charAt(i) + "";
            c = c.toLowerCase();
            result += c;
        }
        return result;
    }

}
