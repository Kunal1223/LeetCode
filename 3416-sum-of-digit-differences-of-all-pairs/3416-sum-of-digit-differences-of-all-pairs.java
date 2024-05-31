class Solution {
    public long sumDigitDifferences(int[] nums) {
        if (nums == null || nums.length == 0) return 0;

        long ans = 0;
        int maxDigits = 10; 

        int[][] digitCount = new int[maxDigits][10];

        // Fill the digitCount array
        for (int num : nums) {
            String numStr = Integer.toString(num);
            int length = numStr.length();
            for (int i = 0; i < length; i++) {
                int digit = numStr.charAt(length - 1 - i) - '0'; // Getting the digit from the right
                digitCount[i][digit]++;
            }
        }

        // Calculate the total sum of digit differences
        for (int i = 0; i < maxDigits; i++) {
            int totalDigitsAtPos = 0;
            for (int j = 0; j < 10; j++) {
                totalDigitsAtPos += digitCount[i][j];
            }

            for (int j = 0; j < 10; j++) {
                // All other digits at position i that are not digit j
                int otherDigitsAtPos = totalDigitsAtPos - digitCount[i][j];
                ans += (long) digitCount[i][j] * otherDigitsAtPos;
            }
        }

        // Each pair of digit differences was counted twice, so divide by 2
        return ans / 2;
    }
}
