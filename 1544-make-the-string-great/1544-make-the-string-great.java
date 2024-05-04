class Solution {
    public String makeGood(String s) {
        int n = s.length();
        Stack<Character> st = new Stack<>();

        for(int i = 0 ; i < n ; i++){
            char ch = s.charAt(i);

            if(st.isEmpty()){
                st.push(ch);
            }
            else{
                if(Character.isUpperCase(ch)){
                    if(st.peek() == Character.toLowerCase(ch)){
                        st.pop();
                        continue;
                    }else{
                        st.push(ch);
                    }
                }

                if(Character.isLowerCase(ch)){
                    if(st.peek() == Character.toUpperCase(ch)){
                        st.pop();
                        continue;
                    }else{
                        st.push(ch);
                    }
                }
            }
        }

        String ans = "";
        while(!st.isEmpty()){
            ans = st.pop() + ans;
        }

        return ans;
        
    }
}