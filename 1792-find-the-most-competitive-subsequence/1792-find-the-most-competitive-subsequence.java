class Solution {
    public int[] mostCompetitive(int[] nums, int k) {
        Stack<Integer> st = new Stack<>();
        int n = nums.length;
        int maxDelete = n - k;

        for(int i = 0 ; i < n ; i++){
            int ele = nums[i];

            while(!st.isEmpty() && maxDelete > 0 && st.peek() > ele){
                st.pop();
                maxDelete--;
            }

            st.push(ele);
        }

        while(maxDelete > 0){
            st.pop();
            maxDelete--;
        }

        int ans[] = new int[k];

        for(int i = k-1 ; i >= 0 ; i--){
            ans[i] = st.pop();
        }

        return ans;
    }
}