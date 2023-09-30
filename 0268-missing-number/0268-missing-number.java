class Solution {
    public int missingNumber(int[] nums) {
        int i =0 ;
        
        while(i<nums.length){
            int correct = nums[i];
            
            if( nums[i] < nums.length && nums[i] != nums[correct]){
                swap(nums , i , correct);
            }
            else{
                i++;
            }
        }

        for (int j = 0; j < nums.length; j++) {
             if(nums[j] != j){
                return j;
            }
        }

        return nums.length; // This should be outside the loop
    }

    void swap(int[] arr, int firstIndex, int secondIndex) {
        int temp = arr[firstIndex];
        arr[firstIndex] = arr[secondIndex];
        arr[secondIndex] = temp;
    }
}
