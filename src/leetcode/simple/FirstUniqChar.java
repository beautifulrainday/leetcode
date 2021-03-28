package leetcode.simple;

import java.util.HashMap;
import java.util.Map;

//给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
//
//
//
// 示例：
//
// s = "leetcode"
//返回 0
//
//s = "loveleetcode"
//返回 2
//
//
//
//
// 提示：你可以假定该字符串只包含小写字母。
// Related Topics 哈希表 字符串
// 👍 364 👎 0
public class FirstUniqChar {

    public static int firstUniqChar(String s) {
        int resInt = -1;
        Map<String, Integer> map = new HashMap(s.length());
        for (int i = 0; i < s.length(); i++) {
            Character ch = s.charAt(i);
            String curStr = ch.toString();
            Integer count = map.get(curStr);
            if (count == null) {
                map.put(curStr, 1);
            } else {
                map.put(curStr, ++count);
            }
        }
        for (int i = 0; i < s.length(); i++) {
            Character ch = s.charAt(i);
            String curStr = ch.toString();
            Integer count = map.get(curStr);
            if (count != null && count == 1) {
                resInt = i;
                return resInt;
            }
        }
        return resInt;
    }

    public static void main(String[] args) {
        System.out.println(firstUniqChar("aabb"));
    }
}
