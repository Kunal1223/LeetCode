public class Solution {

    public boolean checkCircle(ListNode head) {
        if (head == null || head.next == null) return false;
        
        ListNode slow1 = head;
        ListNode fast1 = head.next;

        while (fast1 != null && fast1.next != null) {
            if (slow1 == fast1) {
                return true;
            }
            slow1 = slow1.next;
            fast1 = fast1.next.next;
        }

        return false;
    }

    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) return null;

        if (!checkCircle(head)) return null;

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null ) {
            slow = slow.next;
            fast = fast.next.next;

            if(fast == slow){
                break;
            }
        }

        slow = head;

        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        return fast;
    }
}
