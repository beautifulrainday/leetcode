package leetcode.simple;

/**
 * 定义一个函数，输入一个链表的头节点，反转该链表并输出反转后链表的头节点。
 * <p>
 *  
 * <p>
 * 示例:
 * <p>
 * 输入: 1->2->3->4->5->NULL
 * 输出: 5->4->3->2->1->NULL
 *  
 * <p>
 * 限制：
 * <p>
 * 0 <= 节点个数 <= 5000
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/fan-zhuan-lian-biao-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

class ReverList {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode head1 = new ListNode(2);
        ListNode head2 = new ListNode(3);
        ListNode head3 = new ListNode(4);
        ListNode head4 = new ListNode(5);

        head.next = head1;
        head1.next = head2;
        head2.next = head3;
        head3.next = head4;

        ListNode listNode = reverseList2(head);

        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }

    //标准
    public static ListNode reverseList(ListNode head) {
        ListNode preNode = null;
        while (head != null) {
            //存放实际的下个节点
            ListNode nextNode = head.next;
            //当前节点实际的下个设置为上个节点，毕竟是为了反转嘛。
            head.next = preNode;
            //当做上个节点
            preNode = head;
            if (nextNode == null) {
                return head;
            }
            head = nextNode;
        }
        return head;
    }

    //递归
    public static ListNode reverseList2(ListNode head) {
        if (head == null) {
            return null;
        }
        return re(null, head);
    }

    private static ListNode re(ListNode pre, ListNode cur) {
        if (cur == null) {
            return pre;
        }
        //暂存
        ListNode tmpNode = cur.next;
        cur.next = pre;
        return re(cur, tmpNode);
    }
}
