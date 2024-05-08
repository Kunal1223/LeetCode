class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {

        int count = 0;
        Queue<Integer> qu = new LinkedList<>();

        for (int i = 0; i < tickets.length; i++) {
            qu.add(i);
        }

        while (tickets[k] != 0) {
            int temp = qu.peek();

            if (tickets[temp] != 0) {
                tickets[temp]--;
                count++;
            }
            
            qu.poll();
            qu.add(temp);
        }
        return count;
    }
}