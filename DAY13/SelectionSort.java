package DAY13;
// use a key element to sort the array.
// comapres with the unsorted part of the array.
// an put it in the correct position in the sorted part of the array.
// looks for the minimum element in the unsorted part of the array.
// and puts it in the correct position in the sorted part of the array.
class algo{
    int[] selectionSort(int arr[]){
        for(int i = 0; i < arr.length - 1; i++){
            int minIndex = i;
            for(int j = i+1; j<arr.length; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                    int temp = arr[minIndex];
                    arr[minIndex] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        return arr;
    }
}
public class SelectionSort {
    public static void main(String[] args) {
        algo obj = new algo();
        int[] arr = {64, 25, 12, 22, 11};
        obj.selectionSort(arr);
        System.out.println("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    
}
