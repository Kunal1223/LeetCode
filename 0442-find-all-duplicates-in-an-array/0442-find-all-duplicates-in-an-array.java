class Solution {
    public List<Integer> findDuplicates(int[] nums) {
          int i =0 ;
        while( i < nums.length){
            
            int correct = nums[i] - 1 ;
            if(nums[i] != nums[correct]){
                swap (nums , i , correct);
            }else{
                i++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for( int j = 0 ; j < nums.length ; j++){
            if(nums[j] != j+1){
                ans.add(nums[j]);
            }
        }
        return ans;
        
    }
    
    void swap(int arr[] , int i , int correct){
        int temp = arr[i] ;
        arr[i] = arr[correct];
        arr[correct] = temp ;
    }  
}