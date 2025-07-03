package DAY20;
class Node{
    public int data;
    public Node next;
    Node(int data){
        this.data = data;
        this.next = null;
        
    }


}
public class ReverseList {
    public Node reverse(Node head){
        if(head == null || head.next == null) return head;
        Node newHead = reverse(head.next);
        head.next.next = head;
        head.next = null;        
        return newHead;
    }
    //iterative:
    public Node RevIter(Node head){
        if(head == null || head.next == null)return head;
        Node prev = null;
        Node curr = head;
        Node nex = head.next;
        while(curr!=null){
            curr.next = prev;
            prev = curr;
            curr = nex;
            if(nex != null)nex = nex.next;
        }
        return prev;
    }
}
