package DAY11;
/* Maps are associative arrays i.e.: we get the possibility of owning the key-value pair.
 * we can use the key to get the value.
 * there are three types of maps in java:
 * 1. HashMap: it is unordered and unsorted. it does not maintain the order of insertion.
 * 2. LinkedHashMap: it is ordered and unsorted. it maintains the order of insertion using a doubly linked list.
 * 3. TreeMap: it is ordered and sorted. it maintains the order of insertion and sorts the keys in natural order of occurance or using a custom comparator.
 * 
 */

import java.util.HashMap;

public class Map {
    public static void main(String[] args) {
        HashMap<String, Integer> h = new HashMap<>();
        h.put("one", 1);   
        h.put("two", 2);
        h.put("three", 3);

        System.out.println(h.get("two"));
        if(h.containsKey("o"))System.out.println("yes");
        for(String e: h.keySet()) {
            System.out.println("the key is: " + e + " and the value is: " + h.get(e)    );
        }
        h.remove("one");
        System.out.println(h);
    }
    
}
