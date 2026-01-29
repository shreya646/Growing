class MyQueue {
Stack<Integer> inst;
Stack<Integer>ost;
    public MyQueue() {
        inst=new Stack<>();
         ost=new Stack<>();}
    
    public void push(int x) {
       inst.push(x); 
    }
    
    public int pop() {
        peek();
        return ost.pop();
    }
    
    public int peek() {
     if(ost.isEmpty()){
        while(!inst.isEmpty()){
            ost.push(inst.pop());
        }
     }
      return ost.peek();   
    }
    
    public boolean empty() {
        return inst.isEmpty() && ost.isEmpty();
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