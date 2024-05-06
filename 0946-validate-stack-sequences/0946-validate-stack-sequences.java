class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {

        int n = pushed.length, n1 = popped.length;
        if (n != n1)
            return false;
        int i = 0, j = 0;
        Stack<Integer> st = new Stack<>();

        while (i < n || j < n1) {

            if (!st.isEmpty() && st.peek() == popped[j]) {
                st.pop();
                j++;
            } 
            else if (i < n && pushed[i] != popped[j] || i < n && j < n1 && pushed[i] == popped[j]) {
                while (i < n && pushed[i] != popped[j]) {
                    st.push(pushed[i]);
                    i++;
                }

                if (i < n && j < n1 && pushed[i] == popped[j]) {
                    st.push(pushed[i]);
                    i++;
                }
            }

            else {
                return false;
            }
        }

        return true;
    }
}