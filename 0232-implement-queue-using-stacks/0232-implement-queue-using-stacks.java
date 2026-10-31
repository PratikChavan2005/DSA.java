class MyQueue {
    Stack<Integer> sta1;
    Stack<Integer> sta2;
    public MyQueue() {
        sta1=new Stack<>();
        sta2=new Stack<>();
    }
    
    public void push(int x) {
        while(!sta1.isEmpty()){
            sta2.push(sta1.pop());
        }
        sta1.push(x);
        while(!sta2.isEmpty()){
            sta1.push(sta2.pop());
        }   
    }
    
    public int pop() {
       return  sta1.pop();
    }
    
    public int peek() {
        return sta1.peek();
    }
    
    public boolean empty() {
        return sta1.isEmpty();
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