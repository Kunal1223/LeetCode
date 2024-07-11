// class Solution {
//     public int[] pivotArray(int[] nums, int pivot) {
//         List<Integer> sm = new ArrayList<>();
//         List<Integer> eq = new ArrayList<>();
//         List<Integer> lg = new ArrayList<>();

//         int n = nums.length;
//         int ans[] = new int[n];

//         for(int i = 0 ; i < n ; i++){
//             if(nums[i] < pivot){
//                 sm.add(nums[i]);
//             }
//             else if(nums[i] == pivot){
//                 eq.add(nums[i]);
//             }
//             else{
//                 lg.add(nums[i]);
//             }
//         }

//         int i = 0;

//         for(int a : sm){
//             ans[i++] = a;
//         }

//         for(int a : eq){
//             ans[i++] = a;
//         }
        
//         for(int a : lg){
//             ans[i++] = a;
//         }

//         return ans;
//     }
// }


// ################################### try to solve in less space complexity ###########

class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length;
        int ans[] = new int[n];

        int sm = 0 , eq = 0, lg = 0;

        for(int i = 0 ; i < n ; i++){
            if(nums[i] < pivot) sm++;
            else if(nums[i] == pivot) eq++;
            else lg++;
        }

        int s = 0 , e = sm , l = sm+eq;

        for(int i = 0 ; i < n ; i++){
            if(nums[i] < pivot) ans[s++] = nums[i];
            else if(nums[i] == pivot) ans[e++] = nums[i];
            else ans[l++] = nums[i];
        }

        return ans;
    }
}