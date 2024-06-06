class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if (hand.length % groupSize != 0) {
            return false;
        }

        // Create a frequency map
        Map<Integer, Integer> countMap = new TreeMap<>();
        for (int card : hand) {
            countMap.put(card, countMap.getOrDefault(card, 0) + 1);
        }

        // Iterate through the keys in the TreeMap (sorted order)
        for (int card : countMap.keySet()) {
            int count = countMap.get(card);
            if (count > 0) {
                // We need to form `count` number of groups starting with `card`
                for (int i = 1; i < groupSize; i++) {
                    int nextCard = card + i;
                    if (countMap.getOrDefault(nextCard, 0) < count) {
                        return false;
                    }
                    countMap.put(nextCard, countMap.get(nextCard) - count);
                }
            }
        }

        return true;
    }
}