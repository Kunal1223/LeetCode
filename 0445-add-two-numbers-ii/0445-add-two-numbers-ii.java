class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode p1 = null;
        ListNode curr1 = l1;
        while (curr1 != null) {
            ListNode next = curr1.next;
            curr1.next = p1;
            p1 = curr1;
            curr1 = next;
        }

        ListNode p2 = null;
        ListNode curr2 = l2;
        while (curr2 != null) {
            ListNode next = curr2.next;
            curr2.next = p2;
            p2 = curr2;
            curr2 = next;
        }

        // Add the reversed numbers
        ListNode ans = null;
        int carry = 0;

        while (p1 != null || p2 != null || carry != 0) {
            int left = p1 != null ? p1.val : 0;
            int right = p2 != null ? p2.val : 0;

            int sum = left + right + carry;
            int val = sum % 10;
            carry = sum / 10;

            ListNode newNode = new ListNode(val);
            newNode.next = ans;
            ans = newNode;

            if (p1 != null) p1 = p1.next;
            if (p2 != null) p2 = p2.next;
        }

        return ans;
    }
}
