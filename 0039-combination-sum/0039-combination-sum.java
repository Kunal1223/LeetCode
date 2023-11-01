class Solution {
    
    private void find(int i  , int []arr , int target  , List<List<Integer>> ans , List<Integer>ds){

        if(i == arr.length){
            if(target == 0){
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
        
        if(arr[i] <= target){
            ds.add(arr[i]);
            find(i , arr , target - arr[i] ,ans, ds);
            ds.remove(ds.size() - 1);
        }
        
        find(i+1 , arr , target ,ans, ds);
    }
    
    
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
         find(0 , candidates , target  ,ans, new ArrayList<>());
        return ans;

    }
}