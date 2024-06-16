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
    public int numComponents(ListNode head, int[] nums) {
        ListNode curr = head;
        ListNode parent = null;
        int count=0;
        Set<Integer> hashset = new HashSet<Integer>();

        for(int i : nums){
            hashset.add(i);
        }

        while(curr!=null){

            if(parent==null && curr!=null){
                if(hashset.contains(curr.val)){
                    count++;
                }
            }
            else{
                if(!hashset.contains(parent.val) && hashset.contains(curr.val)){
                    count++;
                }
            }

            parent = curr;
            curr = curr.next;
        }
        return count;
    }
}