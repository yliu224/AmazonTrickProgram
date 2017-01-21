import DataStructure.ListNode;

/**
 * Created by dean on 1/20/17.
 */
public class ReverseSecondHalfofLinkedList {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode slow = head, fast = slow.next;
        while(fast.next != null && fast.next.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode pre = null, cur = slow.next;
        while(cur != null)
        {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        slow.next = pre;
        return head;
    }
}
