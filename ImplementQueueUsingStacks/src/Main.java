import java.util.Stack;

class MyQueue {

    Stack<Integer> s1;
    Stack<Integer>s2;
    /** Initialize your data structure here. */
    public MyQueue() {
        s1=new Stack<Integer>();
        s2=new Stack<Integer>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        s1.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        while (!s1.empty()){
            int num=s1.pop();
            s2.push(num);
        }
        int num=s2.pop();
        while (!s2.empty()){
            int tmp=s2.pop();
            s1.push(tmp);
        }
        return num;
    }

    /** Get the front element. */
    public int peek() {
        while (!s1.empty()){
            int num=s1.pop();
            s2.push(num);
        }
        int num=s2.peek();
        while (!s2.empty()){
            int tmp=s2.pop();
            s1.push(tmp);
        }
        return num;
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return s1.empty();
    }
}