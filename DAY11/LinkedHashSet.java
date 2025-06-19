package DAY11;
//declaration is different but all the method is same as hashset.

import java.util.Iterator;
public class LinkedHashSet {
    public static void main(String[] args) {
        java.util.LinkedHashSet<Integer> lhs = new java.util.LinkedHashSet<>();
        lhs.add(1);
        lhs.add(2);
        lhs.add(3);
        lhs.add(4);
        lhs.add(5);
        // the size of this LinkedHashSet is: 5 because it only maintains the unique values.
        System.out.println(lhs.size());
        System.out.println(lhs);
        
        // iterating through the elements of the LinkedHashSet
        Iterator<Integer> it = lhs.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        
        if (lhs.contains(3)) {
            System.out.println("yes it contains 3");
        }
        
        lhs.remove(4);
        System.out.println(lhs);
    }
}