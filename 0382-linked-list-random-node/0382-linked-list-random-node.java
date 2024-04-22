import java.util.Random;

class Solution {
    ListNode head;

    public Solution(ListNode head) {
        this.head = head;
    }

    public int getRandom() {
        Random random = new Random();
        int count = 0;
        int result = 0;
        ListNode curr = head;

        while (curr != null) {
            count++;
            if (random.nextInt(count) == 0) {
                result = curr.val;
            }
            curr = curr.next;
        }

        return result;
    }
}
