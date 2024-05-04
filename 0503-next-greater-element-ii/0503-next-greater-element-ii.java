class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int ans[] = new int[nums.length];
        if(nums.length == 0) return ans;
        if(nums.length == 1){
            ans[0] = -1;
            return ans;
        }
        Stack<Integer> st = new Stack<>();

        for(int i = nums.length - 2 ; i >= 0 ; i--){
            st.push(nums[i]);
        }

        for(int i = nums.length -1 ; i >= 0 ; i--){

            if(!st.isEmpty() && nums[i] >= st.peek()){
                while(!st.isEmpty() && nums[i] >= st.peek()){
                    st.pop();
                }

                if(st.isEmpty()){
                    st.push(nums[i]);
                    ans[i] = -1;
                }else{
                    ans[i] = st.peek();
                    st.push(nums[i]);
                }
            }else{
                ans[i] = st.peek();
                st.push(nums[i]);
            }
        }

        return ans;
    }
}