class Solution {
    public ListNode removeZeroSumSublists(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode curr = dummy;

        while (curr != null) {
            int sum = 0;
            ListNode runner = curr.next;
            while (runner != null) {
                sum += runner.val;
                if (sum == 0) {
                    curr.next = runner.next;
                }
                runner = runner.next;
            }
            curr = curr.next; 
        }
        return dummy.next;
    }
}