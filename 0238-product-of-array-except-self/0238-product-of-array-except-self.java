class Solution {
    public int[] productExceptSelf(int[] nums) {

        int multi = 1, k = 0;
        int ans[] = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            multi *= nums[i];
        }

        if (multi == 0) {
            int count = 0;
            multi = 1;

            for (int i = 0; i < nums.length; i++) {

                if (nums[i] == 0) {
                    count++;
                    continue;
                } else {
                    multi *= nums[i];
                }
            }

            if (count > 1) {
                k = 0;
                for (int i = 0; i < nums.length; i++) {
                    ans[k++] = 0;
                }
            } else {
                for (int i = 0; i < nums.length; i++) {

                    if (nums[i] == 0) {
                        ans[i] = multi;
                    } else {
                        ans[i] = 0;
                    }
                }
            }
        }

        else {
            for (int i = 0; i < nums.length; i++) {

                int val = multi / nums[i];
                ans[k++] = val;

            }
        }

        return ans;
    }
}