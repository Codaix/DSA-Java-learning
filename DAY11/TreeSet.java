package DAY11;

public class TreeSet {
    public static void main(String[] args) {
        java.util.TreeSet<Integer> ts = new java.util.TreeSet<>();
        ts.add(1);
        ts.add(2);
        ts.add(3);
        ts.add(4);
        ts.add(5);
        // the size of this TreeSet is: 5 because it only maintains the unique values.
        System.out.println(ts.size());
        System.out.println(ts);
        
        // iterating through the elements of the TreeSet
        for (Integer e : ts) {
            System.out.println(e);
        }
        
        if (ts.contains(3)) {
            System.out.println("yes it contains 3");
        }
        
        ts.remove(4);
        System.out.println(ts);
    }
    
}
