package DAY20;

class Node{
    public int data;
    public Node next;
    Node(int data){
        this.data = data;
        this.next = null;
        
    }

}
public class LLLenght {

    public int len(Node head){
        int count = 0;
        Node current = head;
        while(current != null){
            count++;
            current = current.next;
        }
        return count;
    }
    //recursion}
    public int recLen(Node head){
        if (head == null) return 0;
        return 1 + recLen(head.next);
    }


}
