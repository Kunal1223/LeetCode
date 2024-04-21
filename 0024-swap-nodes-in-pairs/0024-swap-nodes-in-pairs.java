class Solution {
    public ListNode swapPairs(ListNode head) {
        
        if(head == null || head.next == null)
            return head;
        
        ListNode ans = new ListNode(-1);
        ans.next = head;
        ListNode prev = ans;

        while(head != null && head.next != null){
            ListNode first = head;
            ListNode second = head.next;
            
            //increase the pointer
            prev.next = second;
            first.next = second.next;
            second.next = first;

            //reasing the value;
            head = first.next;
            prev= first;

        }

        return ans.next;
    }
}