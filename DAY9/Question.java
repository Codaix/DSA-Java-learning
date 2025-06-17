package DAY9;
import java.util.*;
//Que: we are having array with positive integers. we need to get two integers such that:
//      1. index of first element is smaller than j (second element).
//      2. difference between the two elements is maximum.
// e.g. if we have array as {1, 2, 3, 4, 5}, then the output should be 1 and 5.
class MaxDiff{
    int[] arr =  new int[999];
    int[] max = new int[2];
    int maxdiff = 0;
    int Maxdiffernce(){

    for(int i = 0; i<arr.length; i++){
        for(int j = i+1; j<arr.length;j++){
            if(arr[i] - arr[j] >= maxdiff){
                max[0] = arr[i];
                max[1] = arr[j];    
                maxdiff = Math.abs(arr[i] - arr[j]);
            }
        }
    }
    System.out.println("Integers:");
    for(int j = 0; j < max.length; j++){
        System.out.println(max[j]);

    }
    System.out.println("/n");
        System.out.println("Max Difference: ");
    return maxdiff;
    }
}
/* assignment: 
 * 1. any way we can reduce the time complexity of this question?
 * 2. how?
 * 
 */

public class Question {
    public static void main(String[] args) {
        MaxDiff obj = new MaxDiff();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i < n; i++){
            obj.arr[i] = sc.nextInt();
        }
        int maxdiff = obj.Maxdiffernce();
        System.out.println("Max Difference: " + maxdiff);
        sc.close();
    }
}
