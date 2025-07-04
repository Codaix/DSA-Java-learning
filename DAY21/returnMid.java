package DAY21;
// to get the middle element
// using two pointers.
// here we have two pointers . one moves one step at a time and other moves
// two steps at a time.. so till the slow will be at the middle, fast will complete the list.

// and even if we have an even length, the approach will be working

class Node{
    public int data;
    public Node next;
    Node(int data){
        this.data = data;
        this.next = null;   
    }
}

public class returnMid {
    public Node midNode(Node head){
        if(head == null|| head.next == null)return head;
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public static void main(String[] args) {
        
    }
    
    
}
