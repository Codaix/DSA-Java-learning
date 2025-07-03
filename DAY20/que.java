package DAY20;
// we have head of list. we need to return the middle of the list. 
//if length is even, we need to return the second middle element. 
//i.e. if 1,2,3,4 then return 3
// if 5, 9, 9, 3, 5 return 9

// my thought; get the length. divide by 2. if odd then return the ceil value.
// make the value after divide as the target and check the list till the target and return the node at the target.

class Node{
    public int data;
    public Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class que {
    public static void main(System[] args){
    }
    public int Length(Node head){
        if (head == null) return 0;
        return 1 + Length(head.next);
    }

    public int mid(Node head){
        int size = Length(head);
        int midSize = 0;
        if(size/2 != 0){
            midSize = (size+1)/2;
        }else{
        midSize = size/2;
        }
        int target = midSize;
        return target;
    }

    public Node getInt(Node head, int target){
        Node start = head;
        int count = 0;
        while(start != null){
            if(count == target){
                return start;
            }
            start = start.next;
            count++;
        }
        return null;
    }
}
