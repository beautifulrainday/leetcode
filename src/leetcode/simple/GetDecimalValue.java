package leetcode.simple;

/**
 * 给你一个单链表的引用结点 head。链表中每个结点的值不是 0 就是 1。已知此链表是一个整数数字的二进制表示形式。
 * 请你返回该链表所表示数字的 十进制值 。
 * <p>
 * 示例 1：
 * 输入：head = [1,0,1]
 * 输出：5
 * 解释：二进制数 (101) 转化为十进制数 (5)
 * 示例 2：
 * <p>
 * 输入：head = [0]
 * 输出：0
 * 示例 3：
 * <p>
 * 输入：head = [1]
 * 输出：1
 * 示例 4：
 * <p>
 * 输入：head = [1,0,0,1,0,0,1,1,1,0,0,0,0,0,0]
 * 输出：18880
 * 示例 5：
 * <p>
 * 输入：head = [0,0]
 * 输出：0
 * <p>
 * 提示：
 * <p>
 * 链表不为空。
 * 链表的结点总数不超过 30。
 * 每个结点的值不是 0 就是 1。
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */
public class GetDecimalValue {

    public static int getDecimalValue(DeleteNode.ListNode head) {
        List<Integer> list = new ArrayList<>();
        int sum = 0;
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        Collections.reverse(list);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == 1) {
                int temp = 1;
                for (int j = 0; j < i; j++) {
                    temp = temp << 1;
                }
                sum += temp;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        DeleteNode.ListNode l1 = new DeleteNode.ListNode(1);
        DeleteNode.ListNode l2 = new DeleteNode.ListNode(0);
        DeleteNode.ListNode l3 = new DeleteNode.ListNode(1);
        l1.next = l2;
        l2.next = l3;
        System.out.println(getDecimalValue(l1));
    }
}
