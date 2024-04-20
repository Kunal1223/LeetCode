class Solution {
    public ListNode removeElements(ListNode head, int val) {

        ListNode intt = new ListNode(-1);
        intt.next = head;
        ListNode curr = intt;

        while(curr.next != null){

            if(curr.next.val == val){
                while(curr.next != null && curr.next.val == val){
                    curr.next = curr.next.next;
                }
            }
            else{
                curr = curr.next;
            }
        }

        return intt.next;
        
    }
}