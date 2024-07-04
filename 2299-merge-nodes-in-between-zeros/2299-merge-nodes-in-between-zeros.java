class Solution {
    public ListNode mergeNodes(ListNode head) {

        ListNode dummy = new ListNode(0);
        ListNode move = dummy;
        ListNode curr = head.next;
        int sum = 0;

        while(curr != null){

            if(curr.val != 0){
                sum += curr.val;
            }else{
                move.next = new ListNode(sum);
                move = move.next;
                sum = 0;
            }

            curr = curr.next;
        }
        
        return dummy.next;
    }
}