package leetcode.simple;

import java.util.Arrays;
import java.util.Stack;

/**
 * 输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：head = [1,3,2]
 * 输出：[2,3,1]
 *  
 * <p>
 * 限制：
 * <p>
 * 0 <= 链表长度 <= 10000
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/cong-wei-dao-tou-da-yin-lian-biao-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
class ReversePrint {

    public static void main(String[] args) {
        ListNode1 head = new ListNode1(1);
        ListNode1 l1 = new ListNode1(3);
        ListNode1 l2 = new ListNode1(2);
        head.next = l1;
        l1.next = l2;

        int[] ints = reversePrint(head);
        System.out.println(Arrays.toString(ints));
    }

    public static int[] reversePrint(ListNode1 head) {
        if (head == null) {
            return new int[]{};
        }
        int nodeCount = 0;
        Stack<Integer> stack = new Stack<>();
        while (head != null) {
            stack.push(head.val);
            nodeCount++;
            head = head.next;
        }
        int[] res = new int[nodeCount];
        for (int i = 0; i < res.length; i++) {
            res[i] = stack.pop();
        }
        return res;
    }
}

class ListNode1 {
    int val;
    ListNode1 next;

    ListNode1(int x) {
        val = x;
    }
}