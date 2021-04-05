package leetcode.medium;

//给你一个字符串 s，找到 s 中最长的回文子串。
//
//
//
// 示例 1：
//
//
//输入：s = "babad"
//输出："bab"
//解释："aba" 同样是符合题意的答案。
//
//
// 示例 2：
//
//
//输入：s = "cbbd"
//输出："bb"
//
//
// 示例 3：
//
//
//输入：s = "a"
//输出："a"
//
//
// 示例 4：
//
//
//输入：s = "ac"
//输出："a"
//
//
//
//
// 提示：
//
//
// 1 <= s.length <= 1000
// s 仅由数字和英文字母（大写和/或小写）组成
//
// Related Topics 字符串 动态规划
// 👍 3207 👎 0
public class LongestPalindrome {

    public static String longestPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        int leftIndex;
        int rightIndex;
        //int flag = 0;//0没有回文,否则是次数
        //int middleIndex = -1;//中间位-1没有
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            leftIndex = i;
            rightIndex = s.length() - 1;
            StringBuilder tempStr = new StringBuilder();
            while (leftIndex <= rightIndex) {
                if (isHuiWen(s, leftIndex, rightIndex)) {
                    left = leftIndex;
                    right = rightIndex;
                    break;
                } else {
                    rightIndex--;
                }
            }
            for (int j = left; j <= right; j++) {
                tempStr.append(s.charAt(j) + "");
            }
            if (tempStr.length() > sb.length()) sb = tempStr;
        }
        return sb.toString();
    }

    static boolean isHuiWen(String s, Integer start, Integer end) {
        while (start <= end) {
            if (s.charAt(start) == s.charAt(end)) {
                start++;
                end--;
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("abc"));//babad cbbd cbbdbbcc
    }
}
