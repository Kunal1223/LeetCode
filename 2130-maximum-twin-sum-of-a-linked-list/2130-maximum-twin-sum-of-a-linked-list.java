class Solution {

    public ListNode FindMiddle(ListNode head){
        ListNode slow = head;
        ListNode fast = head.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    // public void ReverseR(ListNode head){
    //     ListNode prev = null;
    //     ListNode curr = head;

    //     while(curr != null){
    //         ListNode next = curr.next;
    //         curr.next = prev;
    //         prev = curr;
    //         curr = next;
    //     }

    // }

    public int pairSum(ListNode head) {

        ListNode left = head;
        ListNode mid = FindMiddle(head);
        ListNode right = mid.next;
        mid.next = null;

        ListNode prev = null;
        ListNode curr = right;

        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        int sum = 0 , max = 0;
        ListNode le = left , ri = prev;

        while(le!= null && ri != null){
            sum = le.val + ri.val;
            max = Math.max(sum  , max);

            le = le.next;
            ri = ri.next;
        }
        
    return max;
    }

}