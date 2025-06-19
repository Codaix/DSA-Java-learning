package DAY10;
import java.util.*;
// ArrayList is a part of the collection framework in Java.
public class ArrList {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(); // creating an ArrayList of Integer type
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        System.out.println(arr.get(3));
        for(int i = 0; i < arr.size(); i++) { // iterating through the ArrayList
            System.out.println(arr.get(i));
        }
        System.out.println("from the for each");
        for(var e : arr) { // using for each loop to iterate through the ArrayList to get each element
            System.out.println(e);
        }
    }
    
}
