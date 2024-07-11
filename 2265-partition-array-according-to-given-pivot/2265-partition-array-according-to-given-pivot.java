class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> sm = new ArrayList<>();
        List<Integer> eq = new ArrayList<>();
        List<Integer> lg = new ArrayList<>();

        int n = nums.length;
        int ans[] = new int[n];

        for(int i = 0 ; i < n ; i++){
            if(nums[i] < pivot){
                sm.add(nums[i]);
            }
            else if(nums[i] == pivot){
                eq.add(nums[i]);
            }
            else{
                lg.add(nums[i]);
            }
        }

        int i = 0;

        for(int a : sm){
            ans[i++] = a;
        }

        for(int a : eq){
            ans[i++] = a;
        }
        
        for(int a : lg){
            ans[i++] = a;
        }

        return ans;
    }
}