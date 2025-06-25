package DAY13;
// works on divide and conquer principle.
// using recursoin to sort the array without using looping
// three steps in recursion:
// base case: when the array has only one element, it is already sorted.
// recursive call: divide the array into two halves and sort each half.
// our part: merge the two sorted halves into a single sorted array.
//assignment: implement merge sort using recursion.
public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {13, 12, 11, 6, 5};
        MergeSort obj = new MergeSort();
        obj.mergeSort(arr, 0, arr.length - 1);
        System.out.println("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2; 
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    void merge(int[] arr, int left, int mid, int right) {
        int size1 = mid-left+1;
        int size2 = right-mid;
        int[] arr1 = new int[size1];
        int[] arr2 = new int[size2];
        for(int i = 0;i<size1;i++){
            arr1[i] = arr[left + i];
        }
        for(int i = 0; i<size2;i++){
            arr2[i] = arr[mid+1+i];
        }
        int i = 0, j = 0, k = left;
        while(i<size1 && j<size2){
            if(arr1[i]<=arr2[j]){//putting the data from left sorted array into original.
                arr[k] = arr1[i];
                i++;
            }
            else{
                arr[k] = arr2[j]; //putting the data from right sorted array into original.
                j++;
            }
            k++;
        }
        while(i<size1){ //if there are any elements left in the left sorted array, put them in the original.
            arr[k] = arr1[i];
            i++;
            k++;
        }
        while(j<size2){ //if there are any elements left in the right sorted array, put them in the original.
            arr[k] = arr2[j];
            j++;
            k++;
        }
    }
    
}
