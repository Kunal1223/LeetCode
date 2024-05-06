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
    public ListNode insertionSortList(ListNode head) {

        ListNode curr = head , move = head , temp = head;

        while(curr != null){
            int min = curr.val;
            move = curr;
            temp = curr;

            while(move != null){

                if(move.val < min){
                    temp = move;
                    min = move.val;
                }

                move = move.next;
            }

            int temp1 = curr.val;
            curr.val = temp.val;
            temp.val = temp1;

            curr = curr.next;
        }

        return head;

        
    }
}