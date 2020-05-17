package leetcode.simple;

import leetcode.simple.DeleteNode.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 输入一个链表，输出该链表中倒数第k个节点。为了符合大多数人的习惯，本题从1开始计数，即链表的尾节点是倒数第1个节点。例如，一个链表有6个节点，从头节点开始，它们的值依次是1、2、3、4、5、6。这个链表的倒数第3个节点是值为4的节点。
 * 示例：
 * 给定一个链表: 1->2->3->4->5, 和 k = 2.
 * 返回链表 4->5.
 */
public class Solution {

    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ListNode head1 = new ListNode(4, new ListNode(5, new ListNode(4)));
        ListNode returnNode = getKthFromEnd(head1, 1);
        head.print(returnNode);
    }

    public static ListNode getKthFromEnd(ListNode head, int k) {
        ListNode selectNode = head;
        List<Integer> l = new ArrayList();
        while (selectNode != null) {
            l.add(selectNode.val);
            selectNode = selectNode.next;
        }
        int position = l.size() - k;
        int temp = 0;
        while (temp != position) {
            head = head.next;
            temp++;
        }
        return head;
    }

    public static Integer getKthFromEnd1(ListNode head, int k) {
        ListNode head1 = head;
        ListNode head2 = head;
        for (int i = 0; i < k; i++) {
            head1 = head1.next;
        }
        while (head1 != null) {
            head1 = head1.next;
            head2 = head2.next;
        }
        return head2.val;
    }


}
