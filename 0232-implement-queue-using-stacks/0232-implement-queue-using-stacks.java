class MyQueue {
    Stack<Integer> st1;
    Stack<Integer> st2;
    int peek;

    public MyQueue() {
        st1 = new Stack<>();
        st2 = new Stack<>();
        peek = -1;
    }
    
    public void push(int x) {
        while(!st1.isEmpty()){
            st2.push(st1.pop());
        }

        st1.push(x);

        while(!st2.isEmpty()){
            st1.push(st2.pop());
        }
        
        peek = x;
    }
    
    public int pop() {
        if(!st1.isEmpty()){
            int temp = st1.pop();
            return temp;
        }

        else return 0;
    }
    
    public int peek() {
        return st1.peek();
    }
    
    public boolean empty() {
        return st1.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */