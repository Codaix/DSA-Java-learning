package DAY13;
// it sorts elements from left to right.
// it is a comparison sort.
// it is an in-place sorting algorithm.
// it is a stable sorting algorithm.
// it has a time complexity of O(n^2) in the worst case.
class algo2{
    int[] insertionSort(int arr[]){
        for(int i = 1; i<arr.length; i++){
            int key = arr[i];
            int j = i-1;
            if(arr[j] > key){
                while(j >= 0 && arr[j] >key){
                    arr[j+1] = arr[j];
                    j--;// this may lead to an out of bounds exception if j becomes -1.
                }
                arr[j+1] = key;// This line places the key element in its correct position in the sorted part of the array. 
                // This is the key element that is inserted into the sorted part of the array.

            }

        }
        return arr;
    }
}
public class InsertionSort {
    public static void main(String[] args) {
        algo2 obj = new algo2();
        int[] arr = {13, 12, 11, 6, 5};
        obj.insertionSort(arr);
        System.out.println("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    
}
