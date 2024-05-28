// class Solution {
//      public void moveZeroes(int[] nums) {
         
//         int snowBallSize = 0; 
         
//         for (int i=0;i<nums.length;i++){
            
// 	        if (nums[i]==0){
//                 snowBallSize++; 
//             }
            
//             else if (snowBallSize > 0) {
// 	            int t = nums[i];
// 	            nums[i]=0;
// 	            nums[i-snowBallSize]=t;
//             }
//         }
//     }
// }


class Solution {
    public void moveZeroes(int[] nums) {

        int count = 0;

        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] == 0){
                count++;
            }
        }

        int k = 0;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] != 0){
                nums[k++] = nums[i];
            }
        }

        while(count > 0){
            nums[k++] = 0;
            count--;
        }
        
    }
}