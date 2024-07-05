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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        List<Integer> list = new ArrayList<>();

        ListNode temp = head;
        int p = 0;

        while(temp != null && temp.next != null && temp.next.next != null){
            int x = temp.val;
            int y = temp.next.val;
            int z = temp.next.next.val;

            if((y > x && y > z) || (y < x && y < z)){
                list.add(p + 1);
            }

            temp = temp.next;
            p++;
        }

        int n = list.size();
        if(n < 2) return new int[]{-1, -1};

        int min = Integer.MAX_VALUE;
        for(int i = 1; i < n; i++){
            min = Math.min(min, list.get(i) - list.get(i - 1));
        }

        int max = list.get(n - 1) - list.get(0);

        return new int[]{min, max};
    }
}
