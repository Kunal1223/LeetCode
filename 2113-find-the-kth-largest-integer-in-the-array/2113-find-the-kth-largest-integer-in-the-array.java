class Solution {
    public String kthLargestNumber(final String[] nums, int k) {
        Arrays.sort(nums, (a, b) -> compare(a, b));
        return nums[nums.length - k];
    }

    private int compare(final String num1, final String num2) {
        if (num1.length() != num2.length())
            return Integer.compare(num1.length(), num2.length());

        return num1.compareTo(num2);
    }
}