class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null || head.next.next == null) return head;

        ListNode even = head.next;
        ListNode odd = head  , event = even;

        while(event != null && event.next != null ){
            odd.next = event.next;
            odd = odd.next;

            event.next = odd.next;
            event = event.next;
        }

        odd.next = even;

        return head;
         
    }
}