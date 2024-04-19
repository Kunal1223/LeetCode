class Solution {

    public ListNode SolveByMe(ListNode l1, ListNode l2) {

        ListNode ans = new ListNode(0);
        ListNode temp = ans;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {

            int left = 0 , right = 0 , value = 0 , sum = 0;

            if (l1 != null) {
                left = l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                right = l2.val;
                l2 = l2.next;
            }

            sum = left + right + carry;
            value = sum % 10;

            ListNode next1 = new ListNode(value);
            temp.next = next1;
            temp = temp.next;

            carry = sum /10;
        }

         return ans.next;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        return SolveByMe(l1, l2);

    }
}