// class Solution {
//     public int maxWidthRamp(int[] nums) {
//         int n = nums.length;
//         if (n == 0) return 0;
        
//         int[] minval = new int[n];
//         minval[0] = nums[0];
        
//         for(int i= 1; i < n ; i++){
//             minval[i] = Math.min(minval[i-1] , nums[i]);
//         }

//         int i = n-1, j = n-1 ;
//         int dist = Integer.MIN_VALUE;

//         while(i>=0 && j >= 0){

//             if(nums[i] >= minval[j]){
//                 dist = Math.max(dist , (i-j));
//                 j--;
//             }else{
//                 i--;
//             }
//         }

//         return dist;
//     }
// }




// $$$$$$$$$$$$$$$$$$$$$$$$$ wiht stack $$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$

class Solution {
    public int maxWidthRamp(int[] nums) {
        int n = nums.length;
        if (n == 0) return 0;
        
        Stack<Integer> stack = new Stack<>();
        // First, find the indices of elements in non-decreasing order.
        for (int i = 0; i < n; i++) {
            if (stack.isEmpty() || nums[stack.peek()] > nums[i]) {
                stack.push(i);
            }
        }
        
        // Now, traverse the array from right to left and find the maximum width.
        int maxWidth = 0;
        for (int j = n - 1; j >= 0; j--) {
            while (!stack.isEmpty() && nums[stack.peek()] <= nums[j]) {
                maxWidth = Math.max(maxWidth, j - stack.pop());
            }
        }
        
        return maxWidth;
    }
}
