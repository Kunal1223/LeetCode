/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer> set = new HashSet<>();
        for(int a : nums){
            set.add(a);
        }

        ListNode start = new ListNode(0);
        ListNode temp = start;

        ListNode curr = head;

        while(curr != null){

            if(!set.contains(curr.val)){
                temp.next = curr;
                System.out.print(" " + temp.val);
                temp = temp.next;
            }

            curr = curr.next;
        }

        temp.next = null;

        return start.next;
    }
}