class Solution {

    public int Solvesame(int[] nums, int val) {
        int count = 0;
        boolean isEven = (val % 2 == 0);

        for (int i = 0; i < nums.length; i++) {
            if ((nums[i] % 2 == 0) == isEven) {
                count++;
            }
        }

        return count;
    }

    public int SolveEvenOdd(int[] nums, int val) {
        int count = 0;
        boolean isEven = (val % 2 == 0);

        for (int i = 0; i < nums.length; i++) {
            if ((nums[i] % 2 == 0) == isEven) {
                count++;
                isEven = !isEven; 
            }
        }

        return count;
    }

    public int maximumLength(int[] nums) {
        int alleven, allodd, evenodd, oddeven;

        alleven = Solvesame(nums, 2);  
        allodd = Solvesame(nums, 1); 
        evenodd = SolveEvenOdd(nums, 2); 
        oddeven = SolveEvenOdd(nums, 1); 

        return Math.max(Math.max(alleven, allodd), Math.max(evenodd, oddeven));
    }
}