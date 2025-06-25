package DAY14;
// it works using a pivot, a starting point, and a partitioning process.
// it is a divide and conquer algorithm.
// it is an in-place sorting algorithm.
// it has a time complexity of O(n log n) in the average case and O(n^2) in the worst case.
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {13, 12, 11, 6, 5};
        QuickSort obj = new QuickSort();
        obj.quickSort(arr, 0, arr.length - 1);
        System.out.println("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    void quickSort(int arr[], int min, int max){
        if(min<max){
            int pivot = partition(arr, min, max);
            quickSort(arr, min, pivot - 1);
            quickSort(arr, pivot + 1, max);
        }
    }
    void swap(int i, int j){
        int temp = i;
        i = j;
        j = temp;
    }
    int partition(int arr[], int min, int max){
        int pivot = arr[max];
        int i = (min-1);
        for(int j = min; j<max; j++){
            if(arr[j] <= pivot){
                i++;
                swap(arr[i], arr[j]);// we bring the current arr[j] element at correct position.
                //e.g. if arr = [13,12,11,6,5] if pivot is arr[max] i.e. 5
                // then i can check if arr[j] = min is less than or equal to 5,
                // i can iterate it till i get an element that is less or equal to 5
                // if i get it, i swap the element with 5. if not then i can 
            }
        }
        swap(arr[i+1], arr[max]);
        return i + 1; // return the index of the pivot element after partitioning

    }


}