class Solution {
    public List<List<Integer>> permute(int[] nums) {
        
        List<List<Integer>> result = new ArrayList<>();
        Backtracking(result , new ArrayList<>() , nums);
        return result;
        
    }
    
    
    public void Backtracking(List<List<Integer>> result ,List<Integer> temp , int nums[]){

        if(temp.size() == nums.length){
            result.add(new ArrayList<>(temp));
            return;
        }
        
        for(int number : nums){
            
            if(temp.contains(number)){
                continue;
            }
            
            temp.add(number);
             Backtracking(result , temp , nums);
            
            temp.remove(temp.size()-1);
            
        }
    }
    
}