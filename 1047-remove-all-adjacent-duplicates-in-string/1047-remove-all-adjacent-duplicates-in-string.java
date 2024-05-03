class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        int n = s.length();
        String ans = "";

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);

            if (st.isEmpty()) {
                st.push(ch);
                continue;
            }

            if(st.peek() == ch){
                while(!st.isEmpty() && st.peek() == ch){
                    st.pop();
                }
            }else{
                st.push(ch);
            }
        }

        while(!st.isEmpty()){
            ans = st.pop()+ans;
        }

        return ans;
    }
}