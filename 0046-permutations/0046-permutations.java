// class Solution {
//     public List<List<Integer>> permute(int[] nums) {
        
//         List<List<Integer>> result = new ArrayList<>();
//         Backtracking(result , new ArrayList<>() , nums);
//         return result;
        
//     }
    
    
//     public void Backtracking(List<List<Integer>> result ,List<Integer> temp , int nums[]){

//         if(temp.size() == nums.length){
//             result.add(new ArrayList<>(temp));
//             return;
//         }
        
//         for(int number : nums){
            
//             if(temp.contains(number)){
//                 continue;
//             }
            
//             temp.add(number);
//              Backtracking(result , temp , nums);
            
//             temp.remove(temp.size()-1);
            
//         }
//     }
    
// }

// ############# above method is also working fine and this one is also working $$$$$$$$$$$$$$$$$$

class Solution {

    public void swapNumber(int i , int j , int nums[]){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public void BackTrackByMe(int index , List<List<Integer>> result , int nums[]){

        if(index >= nums.length){
            List<Integer> list = new ArrayList<>();
            for(int i : nums){
                list.add(i);
            }
            result.add(list);
        }

        for(int j = index ; j < nums.length ; j++){
            swapNumber(index , j , nums);
            BackTrackByMe(index+1 , result , nums);
            swapNumber(j , index , nums);
        }

    }


    public List<List<Integer>> permute(int[] nums) {
        
        List<List<Integer>> result = new ArrayList<>();
        int index = 0;

        BackTrackByMe(index , result , nums);

        return result;
    }
}