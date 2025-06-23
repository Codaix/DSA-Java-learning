package DAY12;
// collection framework: to store info as per the requirement
// it provides iterators, algorithms and data structures
/*Que:
* we have integer array num[3,2,3] and an integer value = 2. we need to remove the occurrance of value from the array without using extra space.
* and return the answer array.
e.g. num = [3,2,3] and value = 2 => num = [3,3] and return the new array i.e. [3,3].
*/
public class Revision {
    public static void main(String[] args) {
        int[] num = {3,2,3};
        int value = 2;
        int j = 0; // pointer to keep track of the new array
        for(int i = 0; i<num.length; i++){
            if(num[i] != value){ // if the current element is not equal to the value to be removed
                num[j] = num[i]; // copy the element to the new array
                j++; // increment the pointer
            }
        }
        // print the new array
        System.out.print("New array after removing " + value + ": ");
        for(int i = 0; i<j; i++){
            System.out.print(num[i] + " "); // print the elements of the new array
        }
        System.out.println(); // print a new line for better readability
        
        
    }
    
}

