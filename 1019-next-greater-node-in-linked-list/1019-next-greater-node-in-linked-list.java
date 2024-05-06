class Solution {
    public int[] nextLargerNodes(ListNode head) {
        Stack<Integer> st = new Stack<>();
        ListNode prev = null , curr = head;
        int count = 0;

        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            count++;
        }

        head = prev;
        int ans[] = new int[count];

        for(int i = count -1 ; i >= 0 ; i--){

            if(st.isEmpty() && head != null){
                ans[i] = 0;
                st.push(head.val);
                head = head.next;
            }
            else{
                if(head != null && st.peek() > head.val){
                    ans[i] = st.peek();
                    st.push(head.val);
                    head = head.next;
                }

                else if(head != null && st.peek() <= head.val){

                    while(!st.isEmpty() && st.peek() <= head.val){
                        st.pop();
                    }

                    if(st.isEmpty()){
                        ans[i] = 0;
                        st.push(head.val);
                        head = head.next;
                    }else{
                        ans[i] = st.peek();
                        st.push(head.val);
                        head = head.next;
                    }
                }
            }
        }

        return ans;
    }
}