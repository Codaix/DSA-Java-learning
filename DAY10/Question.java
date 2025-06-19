package DAY10;
/*Que: provided a number in the form of integer array e.g. int = 123 => arr[1,2,3].
we want to add a number e.g. 1 and return the new number but in the form of array:
e.g. 123 + 1 = 124 => arr[1,2,4].
my solution:
we can create a temp array of same size as out array and store the new number by doing %10 of it and keeping the rest elements as 0.then adding the i'th element of the 
temp array with the ith element of original array.
*/
import java.util.Scanner;

import java.util.Arrays;

public class Question {
    Scanner sc = new Scanner(System.in);
    int[] add(){
    String input = sc.nextLine().trim();
    int arr[] = new int[input.length()];
    for(int i = 0; i<input.length();i++){
        arr[i] = input.charAt(i) - '0'; // converting char to int
    }
    int num = 1; // number to be added
    for(int i = arr.length -1; i >=0; i--){
        int sum = arr[i] + num;
            arr[i]= sum%10;
            num = sum/10;
        }
        if(num > 0){
        int[] newarr = new int[arr.length +1];
        newarr[0] = num;
        for(int i = 0; i < arr.length;i++){
            newarr[i+1] = arr[i];
        }
        return newarr;
    }
        return arr;
    }
    public static void main(String[] args) {
        Question q = new Question();
        int[] result = q.add();
        System.out.println("Result: "+ Arrays.toString(result));
    }

// this is having the problem of getting number larger than 100 digits...
// we need to handle that as well.
    
}
