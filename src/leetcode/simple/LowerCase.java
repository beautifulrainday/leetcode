package leetcode.simple;


import java.util.ArrayList;
import java.util.List;

/**
 * 实现函数 ToLowerCase()，该函数接收一个字符串参数 str，并将该字符串中的大写字母转换成小写字母，之后返回新的字符串。
 * 输入: "Hello"
 * 输出: "hello"
 */
public class LowerCase {

    public static void main(String[] args) {
        System.out.print(toLowerCase("Hello"));
    }

    public static String toLowerCase(String str) {
        String[] strs = str.split(",");
        List<String> stringList = new ArrayList<>();
        for (String c : strs) {
            System.out.print(Integer.valueOf(c));
            c = c.toUpperCase();
            stringList.add(c);
        }
        return "";
    }

}
