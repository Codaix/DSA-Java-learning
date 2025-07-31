package DAY4;


public class Arrays {
/*ARRAYS:
 * linear Data structure... 
 * to store linear datatype.
 * to reduce the making of same datatype variables and values of similar datatypes can be stored into single input.
 * Advantage: Memory management.
 * the name of array is nothing but a pointer to the first element of the array.
 * so to access next element, we do +1, +2, +3...
 * so the first element pointer can be shown as arr +0... hence the 0 index.
 * 
 */
// innitialisation:
 int arr[] = new int[5];
 int arr2[] = {1,2,3,4,5,6};
 /*
  * Que: array with values and integer r as 1.
  we need to rotate the array in clockwise direction r times and return the answer.
  e.g.: arr = [1,2,3,4,5]
  ans: arr = [5,1,2,3,4]
  */
  int[] rotate(int arr[], int r){
    int l_num = arr[arr.length -1];
    for(int i = arr.length-1; i>=0; i--){
        arr[i] = arr[i-1];//gets the second last element to the last and keeps doing it till the first element

    }
    arr[0] = l_num;

    return arr;
}
    //*IMPORTANT */
    //for any value of r:
    int[] rotatenew(int arr1[], int r1){
        int narr[] = new int[arr1.length];
        for(int i = 0; i<arr1.length; i++){
            narr[(i+r1)%arr1.length] = arr1[i];

        }
        return narr;
    }
    /*e.g. n =5 r1 = 2;
    narr[] = {0 0 0 0 0}
    2%5  = 2
    narr[2] = arr[0];
    '
    '
    '
    i= 6%5 = 1;
    narr[1] = arr[4]
    4%5 = 4
    4 => 2 + 2
         i   r1

    narr[4] = arr[2];
*/
  /*homework: integer array of +ve number including 0 ...
   we need to move all zeroses at the end of the array. */

    public static void main(String[] args) {
        
    }
    
// to generate all possible subarrays:
public void subarrays(){
int[] arr = {1, 2, 3};
        int n = arr.length;

        for (int i = 0; i < n; i++) { // Starting index
            for (int j = i; j < n; j++) { // Ending index
                for (int k = i; k <= j; k++) { // Print elements of current subarray
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }
    }

}