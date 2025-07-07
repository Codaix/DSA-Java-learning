package DAY11;

import java.util.HashSet;
import java.util.Iterator;

/* 
 * Set is a part of the collection framework in Java.
 * It is a collection that does not allow duplicate elements and 
 * does not maintain the order of elements

 * It only stores unique elements.
 * It is implemented using HashSet, LinkedHashSet, and TreeSet.
 * HashSet is the most commonly used implementation of Set.
 * it doesnt hold the oreder of elements.
 * It uses Hash table to store the elements.
 * O(1) time complexity for add, remove, and contains operations.
 * O(n) time complexity for iterating through the elements.
 
 * LinkedHashSet maintains the order of elements in which they were added.
 * It uses both Hash table and Linked list to store the elements.
 * O(1) time complexity for add, remove, and contains operations.
 * O(n) time complexity for iterating through the elements. because it uses Hash table for storage.
 
 * TreeSet is a sorted set that maintains the order of elements in natural order or
 * using a custom comparator.
 * It uses a Red-Black tree to store the elements.
 * mlog(n) time complexity for add, remove, and contains operations.
 * 
 * Properties of Set:
 * 
 * */
public class Set {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(1);
        hs.add(1);
        hs.add(2);
        hs.add(2);
        hs.add(3);
//the size of this hashset is: 3 because it only maintains the unique values.
        System.out.println(hs.size());
        System.out.println(hs);
        Iterator<Integer> it = hs.iterator();// creating an iterator to iterate through the elements of the HashSet
        
        while(it.hasNext()) { // checking if there is a next element
            System.out.println(it.next()); // printing the next element
        }
        if(hs.contains(2)){
            System.out.println("yes it contains 2");
        }
        hs.remove(3);
        System.out.println(hs);
    }
    
}
