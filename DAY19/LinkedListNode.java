package DAY19;
import java.util.Scanner;


public class LinkedListNode {
    public Node make(){
        Node head = null;
        Node tail = null;
        System.out.println("Enter your numbers: ");
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        while(data != -1){
            Node node = new Node(data);
            if(head == null){
                head = node;
                tail = node;
            }
            else{
                tail.next = node;
                tail = tail.next;
            }
        }
        sc.close();
        return head;
    }
    public void print(Node head){
        if( head == null)return;
        Node tail = head;
        while(tail != null){
            System.out.println(tail.data+"--> ");
            tail = head.next;
        }
        System.out.println("null");
        return;
    }
    Node insertATEnd(Node head, int val){
        Node node = new Node(val);
        if(head == null)return node;
        if(head.next == null){
            head.next = node;
            return head;
        }
        Node tail = head;// this is because we need to put value at the end of the linked list
        while(tail.next == null){
            tail = tail.next;
        }
        tail.next = node;
        return head;
    }
    Node insertAtIndex(Node head, int val, int index){
        Node node = new Node(val);
        if(head == null) return null;
        if(index == 1){
            Node nhead = new Node(val);
            nhead.next = head;
            head = nhead;
            return head;
        }
        int i = 1;
        Node tail = head;
        while(tail != null && i < index -1){
            tail = tail.next;
            i++;
        }
        if(tail != null){
            Node n = tail.next;
            tail.next = node;
            tail = tail.next;
            tail.next = n;


        }
        return head;
        
    }
    
}
