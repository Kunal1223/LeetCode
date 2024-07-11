import java.util.Stack;

class Solution {
    public String reverseParentheses(String s) {
        Stack<String> st = new Stack<>();
        int n = s.length();
        String temp = "";

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                st.push(temp);
                st.push("(");
                temp = "";
            } 
            else if (ch == ')') {
                StringBuilder sb = new StringBuilder(temp).reverse();
                temp = sb.toString();

                while (!st.isEmpty() && !st.peek().equals("(")) {
                    temp = st.pop() + temp;
                }

                if (!st.isEmpty() && st.peek().equals("(")) {
                    st.pop();
                }

                if (!st.isEmpty()) {
                    temp = st.pop() + temp;
                }
            } else {
                temp += ch;
            }
        }

        StringBuilder result = new StringBuilder(temp);
        while (!st.isEmpty()) {
            result.insert(0, st.pop());
        }

        return result.toString();
    }
}
