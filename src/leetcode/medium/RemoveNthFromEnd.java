/*
package leetcode.medium;

//给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。
//
// 进阶：你能尝试使用一趟扫描实现吗？
//
//
//
// 示例 1：
//
//
//输入：head = [1,2,3,4,5], n = 2
//输出：[1,2,3,5]
//
//
// 示例 2：
//
//
//输入：head = [1], n = 1
//输出：[]
//
//
// 示例 3：
//
//
//输入：head = [1,2], n = 1
//输出：[1]
//
//
//
//
// 提示：
//
//
// 链表中结点的数目为 sz
// 1 <= sz <= 30
// 0 <= Node.val <= 100
// 1 <= n <= sz
//
// Related Topics 链表 双指针
// 👍 1322 👎 0

import leetcode.simple.DeleteNode.ListNode;

public class RemoveNthFromEnd {

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        if (head.next == null) {
            return null;
        }
        // 双指针
        ListNode slowNode = head;
        ListNode fastNode = head;
        for (int i = 0; i < n - 1; i++) {
            fastNode = fastNode.next;
        }
        ListNode preNode = null;
        while (fastNode.next != null) {
            // 这里记录上个节点，用于处理n=1空指针的情况
            preNode = slowNode;
            fastNode = fastNode.next;
            slowNode = slowNode.next;
        }
        if (slowNode.next == null) {
            preNode.next = null;
        } else {
            slowNode.val = slowNode.next.val;
            slowNode.next = slowNode.next.next;
        }
        return head;
    }

    public static void main(String[] args) {
        */
/*ListNode listNode5 = new ListNode(5, null);
        ListNode listNode4 = new ListNode(4, listNode5);
        ListNode listNode3 = new ListNode(3, listNode4);
        ListNode listNode2 = new ListNode(2, listNode3);
        ListNode head = new ListNode(1, listNode2);*//*

        ListNode listNode2 = new ListNode(2, null);
        ListNode head = new ListNode(1, listNode2);
        ListNode res = removeNthFromEnd(head, 1);
        System.out.println(1);

        */
/*String s1 = new StringBuilder("aa").append("cc").toString();
        String s2 = "aacc".intern();
        System.out.println(s1==s2);

        String s11 = new StringBuilder("ja").append("va").toString();
        String s22 = "java".intern();
        System.out.println(s11==s22);*//*

    }
}
*/
