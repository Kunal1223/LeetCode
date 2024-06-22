class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        int n = s.length();

        if(n < 3) return false;

        for(int i = 0 ; i < n ; i++){
            char ch = s.charAt(i);

            if(ch == 'a') st.push(ch);

            else if(ch == 'b'){
                if(!st.isEmpty() && st.peek() == 'a'){
                    st.push(ch);
                }
                else return false;
            }
            else{
                if(!st.isEmpty() && st.peek() == 'b'){
                    st.pop();

                    if(!st.isEmpty() && st.peek() == 'a'){
                        st.pop();
                    }
                    else{
                        return false;
                    }
                }else{
                    return false;
                }
            }
        }

        if(!st.isEmpty()) return false;
        else return true;
    }
}