package DAY13;
class algo{
    int[] bubbleSort(int arr[]){
        // Bubble Sort Algorithm

        // The above code sorts the array in ascending order.

        for (int i  = 0; i<arr.length - 1; i++){
        for(int j = 0; j<arr.length - i -1; j++){
                if(arr[j] > arr[i]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }

        } return arr;
    }
}

public class BubbleSort {
    public static void main(String[] args) {
        algo obj = new algo();
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        obj.bubbleSort(arr);
        System.out.println("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

    }
    
}
