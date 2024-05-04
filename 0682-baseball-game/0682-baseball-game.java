class Solution {
    public int calPoints(String[] operations) {
         
        int n = operations.length;
        if(n == 0) return 0;
        Stack<Integer> st = new Stack<>();

        for(String s : operations){

            if(s.equals("+")){
                int n1 = st.pop();
                int n2 = st.pop();
                int n3 = n1 + n2;
                st.push(n2);
                st.push(n1);
                st.push(n3);
            }

            else if(s.equals("C")){
                st.pop();
            }

            else if(s.equals("D")){
                int n1 = st.pop();
                int res = n1 * 2;
                st.push(n1);
                st.push(res);
            }

            else{
                st.push(Integer.parseInt(s));
            }
        }

        int result = 0;
        while(!st.isEmpty()){
            result += st.pop();
        }

        return result;

    }
}