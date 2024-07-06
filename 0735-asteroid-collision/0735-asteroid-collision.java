import java.util.Stack;

class Solution {
    public int[] asteroidCollision(int[] ast) {
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < ast.length; i++) {
            if (ast[i] > 0) {
                st.push(ast[i]);
            } else {
                boolean flag = true;

                while (flag && !st.isEmpty() && st.peek() > 0) {
                    if (st.peek() < Math.abs(ast[i])) {
                        st.pop();
                    } else if (st.peek() == Math.abs(ast[i])) {
                        st.pop();
                        flag = false;
                    } else {
                        flag = false;
                    }
                }

                if (flag) {
                    st.push(ast[i]);
                }
            }
        }

        int n = st.size();
        int[] result = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            result[i] = st.pop();
        }

        return result;
    }
}
