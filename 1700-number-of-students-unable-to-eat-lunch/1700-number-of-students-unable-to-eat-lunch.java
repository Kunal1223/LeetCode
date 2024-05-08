class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Stack<Integer> st = new Stack<>();
        Queue<Integer> qu = new ArrayDeque<>();

        for(int i = 0 ; i < students.length ; i++){
            qu.add(students[i]);
        }

        for(int i = sandwiches.length -1 ; i >= 0 ; i--){
            st.push(sandwiches[i]);
        }

        int count = 0;

        while(!st.isEmpty() && !qu.isEmpty() && count != qu.size()){

            if(st.peek() == qu.peek()){
                st.pop();
                qu.poll();
                count = 0;
            }else{
                int temp = qu.poll();
                qu.add(temp);
                count++;
            }
        }

        return qu.size();
    }
}