package DAY24;

import java.util.*;
//implimenting stack using 1 queue;
// we can do this by using recursion.

public class StackWQueue {
    Queue<Integer> q1;

    StackWQueue(){
        this.q1 = new LinkedList<>();

    }
    void push(int val){
        q1.add(val);
        for(int i = 0; i < q1.size() - 1; i++){
            q1.add(q1.poll());
        }
        
    }
    int pop(){
        if(q1.isEmpty()) return -1;
        return q1.poll();
    }
    int top(){
        if(q1.isEmpty()) return -1;
        return q1.peek();
    }
    int size(){
        return q1.size();
    }
    boolean isEmpty(){
        return q1.isEmpty();
    }
    
}
