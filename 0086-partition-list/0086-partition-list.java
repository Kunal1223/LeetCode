class Solution {
    public ListNode partition(ListNode head, int x) {
        
        ListNode left = new ListNode(0);
        ListNode right = new ListNode(0);

        ListNode curr = head;
        ListNode l = left;
        ListNode r = right;


        while(curr != null){
            if(curr.val < x){
                l.next = curr;
                l = l.next;
            }else{
                r.next = curr;
                r = r.next;
            }

            curr = curr.next;
        }

        l.next = right.next;
        r.next = null;

        return left.next;
    }
}