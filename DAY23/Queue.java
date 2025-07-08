package DAY23;
// implimenting push pop front empty and size using linked list.

class Node{
    public int data;
    public Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
class MyQueue {
    private Node front, rear;
    private int size;
    public MyQueue() {
        front = rear = null;
        size = 0;
    }
    public Node push(int data){
        Node newnode = new Node(data);
        if(rear == null){
            front = rear = newnode;
        }
        else{
            rear.next = newnode;
            rear = newnode;
        }
        size++;
        return newnode;
    }
    public int pop() {
        if (front == null) return -1;
        int value = front.data;
        front = front.next;
        if (front == null) rear = null;
        size--;
        return value;
    }
    public int front() {
        if (front == null) return -1;
        return front.data;
    }

    public boolean empty() {
        return front == null;
    }

    public int size() {
        return size;
    }
}
//implement this using stack.

public class Queue {
        
}
