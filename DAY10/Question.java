package DAY10;
/*Que: provided a number in the form of integer array e.g. int = 123 => arr[1,2,3].
we want to add a number e.g. 1 and return the new number but in the form of array:
e.g. 123 + 1 = 124 => arr[1,2,4].
my solution:
we can create a temp array of same size as out array and store the new number by doing %10 of it and keeping the rest elements as 0.then adding the i'th element of the 
temp array with the ith element of original array.
*/
import java.util.Scanner;

class ArrAdd{
    int arr[] = new int[999];
    int temparr[] = new int[arr.length];
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int[] add(){
        while(num>0){
            int i = 0;
            int digit = num%10;
            temparr[i] = digit;
            i++;
            num = num/10;
        }
        int newarr[] = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            if(i < temparr.length){
                newarr[i] = arr[i] + temparr[i];
            }else{
                newarr[i] = arr[i];
            }
        }
        return newarr;
    }
}
// this is having the problem of gt=etting number larger than 100 digits...
// we need to handle that as well.

public class Question {
    
}
