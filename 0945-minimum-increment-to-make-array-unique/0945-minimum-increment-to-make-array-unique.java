//         ###################### Time Limite Exceed ###################################

// class Solution {
//     public int minIncrementForUnique(int[] nums) {
        

//         Set<Integer> set = new HashSet<>();
//         int ans = 0;

//         Arrays.sort(nums);
//         int i = 0;

//         for(int a : nums){
//             set.add(a);
//         }

//         while(i < nums.length - 1){

//             if(nums[i] == nums[i+1]){
//                 int count = 0 , temp = nums[i];
                
//                 while(set.contains(temp)){
//                     count++;
//                     temp++;
//                 }

//                 nums[i] = temp;
//                 set.add(temp);
//                 ans += count;
//             }else{
//                 set.add(nums[i]);
//                 i++;
//             }
//         }

//         return ans;   
//     }
// }


class Solution {
    public int minIncrementForUnique(int[] nums) {
        Arrays.sort(nums);
        int ans = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= nums[i - 1]) {
                ans += nums[i - 1] - nums[i] + 1;
                nums[i] = nums[i - 1] + 1;
            }
        }
        return ans;
    }
}