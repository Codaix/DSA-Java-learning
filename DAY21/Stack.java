package DAY21;

import java.util.ArrayList;
import java.util.LinkedList;

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
    private LinkedList<Integer> arr2;
    public void Stack2(){
        arr2 = new LinkedList<>();
    }
    public void  EnterFirst(Integer a){
        arr2.addFirst(a);
    }
    public int removeLast(){
        if(arr2.size() == 0)return -1;
        int e = arr2.get(arr2.size()-1);
        arr2.removeLast();
        return e;
    }
    public int first(){
        if(arr2.size()==0)return -1;
        return arr2.get(arr2.size()-1);
    }
    public boolean isEmptyList(){
        return arr2.size() == 0;
    }
}
// impliment this stack class with same method as linked list
