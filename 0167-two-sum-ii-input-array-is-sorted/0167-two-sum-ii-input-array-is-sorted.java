class Solution {
    public int[] twoSum(int[] numbers, int target) {

        int[] a = new int[2]; 

        int n = numbers.length, i = 0;

        if(n == 0 || n == 1){
            return a; 
        }

        int j = n - 1;

        while(i < j){
            int sum = numbers[i] + numbers[j];

            if(sum == target){
                return new int[]{i + 1, j + 1}; 
            }

            else if(sum < target){
                i++;
            }

            else{
                j--;
            }
        }

        return a; 
    }
}
