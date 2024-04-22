class Solution {
    public ListNode removeNodes(ListNode head) {
        Stack<Integer> st = new Stack<>();

        ListNode curr = head;
        ListNode ans = null;

        while(curr != null){
            
            if(st.isEmpty()){
                st.push(curr.val);
            }

            else{

                if(st.peek() > curr.val){
                    st.push(curr.val);
                }

                else{
                    while(!st.isEmpty() && st.peek() < curr.val){
                        st.pop();
                    }
                    st.push(curr.val);
                }
            }

            curr = curr.next;
        }

        while(!st.isEmpty()){
            ListNode list = new ListNode(st.pop());
            list.next = ans;
            ans = list;
        }

        return ans;

        
    }
}