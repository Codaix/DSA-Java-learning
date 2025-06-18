package DAY10;
import java.util.Iterator;
//linked List
import java.util.LinkedList;
public class LinkList {
    public static void main(String[] args) {
        LinkedList<String> l1 = new LinkedList<>();
        l1.add("Pranav");
        l1.add("Pranav2");
        l1.add("Pranav3");
        // we can't use the for loop to iterate through the linked list.

        //since it is a replica of doubly linked list
        l1.addFirst("Pranav4");
        l1.addLast("Pranav5");

        //Similary we can remove elements from the first and the last
        System.out.println(l1.removeFirst());
        System.out.println(l1.getFirst());
        
        Iterator<String > it = l1.iterator(); // creating an iterator for the linked list
        while(it.hasNext()) { // checking if there is a next element in the linked list
            System.out.println(it.next()); // printing the next element in the linked list
        }
    }
    
}
