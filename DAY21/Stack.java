package DAY21;

import java.util.ArrayList;

// abstract method of storing the elements
public class Stack {
    private ArrayList<Integer> arr;
    public Stack(){
        arr = new ArrayList<>();

    }
    public void push(Integer a){
        arr.add(a);
    }
    public int pop(){
        if(arr.size() == 0)return -1;
        int e = arr.get(arr.size()-1);
        arr.remove(arr.size()-1);
        return e;
    }
    public int top(){
        if(arr.size() == 0) return -1;
        return arr.get(arr.size()-1);
    }
    public boolean  isEmpty(){
        return arr.size() == 0;
    }
    
}
// impliment this stack class with same method as linked list