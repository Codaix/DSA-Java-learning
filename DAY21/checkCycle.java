package DAY21;
// we have a list with a cycle in between.
// we need to check if there is a cycle present or not and return true and false

import java.util.HashSet;

// we can use hashmap or hshset
// hashmap <key<node>, int<integer>>
public class checkCycle {
	public boolean cycle(Node head){
        if(head == null || head.next == null)return false;
        HashSet<Node> set = new HashSet<>();
        Node tail = head;
        while(tail != null){
            if(set.contains(tail))return true;
            set.add(tail);
            tail = tail.next;
        }        	
		return false;
	}
    //another method:
    public boolean cycle2(Node head){
        if(head == null || head.next == null)return false;
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast.next == slow || fast == slow){
                return true;
            }
        }
        return false;
    }
    // follow up =  if there is a loop, get the starting point of the loop.
    public Node cycleStart(Node head){
        if(head == null || head.next == null)return null;
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow){
                slow = head;
                while(slow != fast){
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null;
    }
}
