package DAY11;
/*Que: provided a number in the form of integer array e.g. int = 123 => arr[1,2,3].
we want to add a number e.g. 1 and return the new number but in the form of array:
e.g. 123 + 1 = 124 => arr[1,2,4].
my solution:
we can create a temp array of same size as out array and store the new number by doing %10 of it and keeping the rest elements as 0.then adding the i'th element of the 
temp array with the ith element of original array.
*/

//The following solution is in arraylist form rather than the conventional strinf to integer array conversion.
import java.util.ArrayList;
import java.util.Collections;
public class QuestionCont {
    ArrayList<Integer> plusOne(ArrayList<Integer>arr){
        ArrayList<Integer> ans = new ArrayList<>();
        int num = 1;//element to be added
        // we need to add the element form the last
        for (int i = arr.size() -1; i >=0; i--){
            int sum = arr.get(i) + num; // adding the number to the last element
            int d = sum%10;
            num = sum/10;
            ans.add(d); // inserting the digit added with the carry into new array.
        }
        if(num>0){ // if there is a carry left after the last addition
            ans.add(num);
        }
        Collections.reverse(ans); // reversing the arraylist to get the correct order
        return ans; // returning the new arraylist


    }
    
}
