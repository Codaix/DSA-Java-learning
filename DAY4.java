public class DAY4 {
    //previous day3 homework
    // Homework: return the last occurance of a character in a sequence.
    int returnLastCharRec(String str, char c, int i){
        //here i = str.length()-1;
        if(i < 0||i>= str.length())return -1;
        if(str.charAt(i) == c)return i;
        int index = returnLastCharRec(str, c, i-1);
        return index;
    }
    //other method:
    // base:
    int returnLastCharRec2(String str, char c, int i){
    if(i>= str.length()) return -1;//checks if the integer is greater than the length.
    int index = returnLastCharRec(str,c,i+1);//checks if the character c matches with any charcter at str from i+1 to n-1 and returns the last occurance.
    if(index == -1 && str.charAt(i) == c) index = i;//checks only when we do not find the charcter in the string. and checks if the character is at index i
    return index;

}
/*ARRAYS:
 * linear Data structure... 
 * to store linear datatype.
 * to reduce the making of same datatype variables and values of similar datatypes can be stored into single input.
 * Advantage: Memory management.
 * the name of array is nothing but a pointer to the first element of the array.
 * so to access next element, we do +1, +2, +3...
 * so the first elemt pointer can be shown as arr +0... hence the 0 index.
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
  

    public static void main(String[] args) {
        
    }
    
}
