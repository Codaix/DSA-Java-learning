/*homework: we are given with integer array of +ve number including 0 ...
   we need to move all zeroes at the end of the array*/

import java.util.Arrays;

public class DAY5 {
    /*brute force:
    int[] returnSovedArr(int arr[]){
        int narr[] = new int[arr.length];
        int j = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] != 0){
                narr[j++] = arr[i];
            }
        }
        return narr;

    }*/
    int[] returnSolvedArr(int arr[]){
        int c = 0;
        for(int i=0; i<arr.length; i++){
            c += (arr[i] == 0?1:0);
            if(arr[i] != 0)arr[i-c] = arr[i];
        }        
        for(int i = arr.length - c ; i<arr.length; i++){
            arr[i] = 0;
        }
        return arr;
    }
    /*multidimensional arrays: 
     * arrays where each element of array is nothing but an array.
     * 
     */
    int Td []    []   =  {{1,2,3,4},
    /*    rows columns*/  {3,4,5,6},
                          {4,5,6,7}};
    /* Que: given a matrix where elements can be zeros and non-zeroes
     *      we need to convert entire row and column to zero if we encounter a zero
     */
    int[][] convertMatrix(int arr[][]){
        int r[] = new int[arr.length];
        int c[] = new int[arr[0].length];
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[i].length;j++){
                if(arr[i][j] == 0){
                r[i] = 1;
                c[j] = 1;
                }
            }
        }
        for(int i = 0;i<arr.length;i++){
            for(int j = 0; j<arr[i].length;j++){
                if(r[i] == 1 || c[j] ==1){
                arr[i][j] = 0;
                }
            }
        }
        return arr;
    }
    /* homework: use this same question and rather than using different arrays, use brute force to
     * flag the rows and column elements inside the matrix and covert it there only.
     */

    
}
