package DAY10;
// different ways to give the definition of the methods of interface.
// 1. using anonymous class
// 2. using abstract class keyword

// if interface is functional interface:
// then we can use lambda expression to implement the method.
// lambda expression is a method which can be defined as ->.

/* assignment: 
 * 1. any way we can reduce the time complexity of this question?
 * 2. how?
 * solution to make the time complexity to O(n):
 * 1. we can use two pointers, one at the start and one at the end of the array.
 * 2. we can iterate through the array and find the maximum and minimum elements.
 * 3. we can then return the difference between the maximum and minimum elements.
 */
//Sol:

public class InterfaceCont {
    int maxdiff(int arr[]){
        int max = arr[0];
        int min = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return max - min;


    }
}
