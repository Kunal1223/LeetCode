// class Solution {
//     public int countStudents(int[] students, int[] sandwiches) {
//         Stack<Integer> st = new Stack<>();
//         Queue<Integer> qu = new ArrayDeque<>();

//         for(int i = 0 ; i < students.length ; i++){
//             qu.add(students[i]);
//         }

//         for(int i = sandwiches.length -1 ; i >= 0 ; i--){
//             st.push(sandwiches[i]);
//         }

//         int count = 0;

//         while(!st.isEmpty() && !qu.isEmpty() && count != qu.size()){

//             if(st.peek() == qu.peek()){
//                 st.pop();
//                 qu.poll();
//                 count = 0;
//             }else{
//                 int temp = qu.poll();
//                 qu.add(temp);
//                 count++;
//             }
//         }

//         return qu.size();
//     }
// }


// brute force 
class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int n=students.length;
        int ones_count=0,zero_count=0;
        for(int p:students){
            if(p==1) ones_count++;
            else zero_count++;
        }
         for(int i=0;i<n;i++){
            if(sandwiches[i]==1&&ones_count>0) ones_count-=1;
            else if(sandwiches[i]==0&&zero_count>0) zero_count-=1;
            else return n-i;
        }
        return 0;

    }
}