/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        
        if(head == null || head.next == null) return null;
        int count = 0;

        ListNode temp = head;

        while(temp != null){
            temp = temp.next;
            count++;
        }

        if(count % 2 == 0){
            ListNode fast = head.next;
            ListNode slow = head;

            while(fast != null && fast.next != null){
                fast = fast.next.next;
                slow = slow.next;
            }

            slow.next = slow.next.next;
            return head;
        }else{
            ListNode fast = head.next.next;
            ListNode slow = head;

            while(fast != null && fast.next != null){
                fast = fast.next.next;
                slow = slow.next;
            }

            slow.next = slow.next.next;
            return head;
        }

        // return head;
    }
}