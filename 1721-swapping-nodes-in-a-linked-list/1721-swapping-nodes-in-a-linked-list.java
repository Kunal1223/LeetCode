class Solution {
    public ListNode swapNodes(ListNode head, int k) {

        int count = 0;
        ListNode curr = head;

        while(curr != null){
            curr = curr.next;
            count++;
        }

        if(count - k < 0 ) return head;

        ListNode curr1 = head , curr2 = head;
        int c1 = 1 , c2 = 1;

        while(c1 < k){
            curr1 = curr1.next;
            c1++;
        }

        while(c2 <= count - k){
            curr2 = curr2.next;
            c2++;
        }

        int temp = curr1.val;
        curr1.val = curr2.val;
        curr2.val = temp;

        return head;
        
    }
}