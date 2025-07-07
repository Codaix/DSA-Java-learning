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

    //Using LinkedList
    public class Stack2 {
    private Node top;
    private int size;

    private static class Node {
        int data;
        Node next;
        Node(int d, Node n) { 
            data = d; 
            next = n; 
        }
    }

    public Stack2() {
        top = null;
        size = 0;
    }

    public void push(int x) {
        top = new Node(x, top);
        size++;
    }

    public int remove() {
        if (top == null) return -1;
        int val = top.data;
        top = top.next;
        size--;
        return val;
    }

    public int top() {
        if (top == null) return -1;
        return top.data;
    }

    public int size() {
        return size;
    }

    public boolean empty() {
        return top == null;
    }
}

}
// impliment this stack class with same method as linked list
