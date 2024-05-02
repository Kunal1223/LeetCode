// ################################### division approch $$$$$$$$$$$$$$$$$$$$$

// class Solution {
//     public int[] productExceptSelf(int[] nums) {
        // int multi = 1, k = 0;
        // int ans[] = new int[nums.length];

        // for (int i = 0; i < nums.length; i++) {
        // multi *= nums[i];
        // }

        // if (multi == 0) {
        // int count = 0;
        // multi = 1;

        // for (int i = 0; i < nums.length; i++) {

        // if (nums[i] == 0) {
        // count++;
        // continue;
        // } else {
        // multi *= nums[i];
        // }
        // }

        // if (count > 1) {
        // k = 0;
        // for (int i = 0; i < nums.length; i++) {
        // ans[k++] = 0;
        // }
        // } else {
        // for (int i = 0; i < nums.length; i++) {

        // if (nums[i] == 0) {
        // ans[i] = multi;
        // } else {
        // ans[i] = 0;
        // }
        // }
        // }
        // }

        // else {
        // for (int i = 0; i < nums.length; i++) {

        // int val = multi / nums[i];
        // ans[k++] = val;

        // }
        // }

//         return ans;
//     }
// }

// ############################## with 0(n) space complexity ##############
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int pre[] = new int[n];
        int suff[] = new int[n];
        pre[0] = 1;
        suff[n - 1] = 1;

        for (int i = 1; i < n; i++) {
            pre[i] = pre[i - 1] * nums[i - 1];
        }
        for (int i = n - 2; i >= 0; i--) {
            suff[i] = suff[i + 1] * nums[i + 1];
        }

        int ans[] = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i] = pre[i] * suff[i];
        }
        return ans;
    }
}
