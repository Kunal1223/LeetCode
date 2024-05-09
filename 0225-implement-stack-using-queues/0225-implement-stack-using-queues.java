class MyStack {

    Queue<Integer> q1;
    Queue<Integer> q2;
    int top ;

    public MyStack() {
        q2 = new LinkedList<>();
        q1 = new LinkedList<>();
        top = -1;
    }
    
    public void push(int x) {
        while(!q1.isEmpty()){
            q2.add(q1.poll());
        }

        q1.add(x);

        while(!q2.isEmpty()){
            q1.add(q2.poll());
        }
        
        top = x;
    }
    
    public int pop() {
        
        int poped = q1.poll();

        if(!q1.isEmpty())
            top = q1.peek();
        else top = 0;

        return poped;
    }

    public int top() {
        return top;        
    }
    
    public boolean empty() {
        return q1.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */