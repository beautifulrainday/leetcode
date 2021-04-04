package leetcode.simple;

import java.util.ArrayList;
import java.util.List;

//写一个程序，输出从 1 到 n 数字的字符串表示。
//
// 1. 如果 n 是3的倍数，输出“Fizz”；
//
// 2. 如果 n 是5的倍数，输出“Buzz”；
//
// 3.如果 n 同时是3和5的倍数，输出 “FizzBuzz”。
//
// 示例：
//
// n = 15,
//
//返回:
//[
//    "1",
//    "2",
//    "Fizz",
//    "4",
//    "Buzz",
//    "Fizz",
//    "7",
//    "8",
//    "Fizz",
//    "Buzz",
//    "11",
//    "Fizz",
//    "13",
//    "14",
//    "FizzBuzz"
//]
//
// 👍 92 👎 0
public class FizzBuzz {

    public static List<String> fizzBuzz(int n) {
        List<String> resList = new ArrayList<>();
        String res;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) {
                res = "Fizz";
            } else if (i % 5 == 0) {
                res = "Buzz";
            } else {
                res = String.valueOf(i);
            }
            if (i % 3 == 0 && i % 5 == 0) {
                res = "FizzBuzz";
            }
            resList.add(res);
        }
        return resList;
    }

    public static void main(String[] args) {
        List<String> list = fizzBuzz(15);
        for (String l : list) {
            System.out.println(l);
        }
    }
}
