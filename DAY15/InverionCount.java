package DAY15;

// problem inversion count: count of inversion pairs in an array i.e. arr[i] > arr[j] ; i<j
// e.g. arr[5,4,3,2,1] so pairs: (5,4)(5,3)(5,2),(5,1) = 4 pairs. similarly 4 has 3 pairs, 3 has 2 pairs and 2 has 1 pair and 1 has no pair.
// so the total inversion pair count = 4 + 3 + 2 + 1.
class checkPair{
void invPair(int arr[]){
    int count = 0;
    for(int i = 0; i<arr.length;i++){
        for(int k = i+1; k<arr.length;k++){
            while(i<k){
                if(arr[i]>arr[k]){
                count = count + 1;
                }
            }
        }
    }
    }

// optimising it using merge sort: in merge sort, we are dividing the array into half 
// and then sorting it and calling the fi=unction to merge.

void invCheck(int arr[], int left, int right){
    int count = 0;
    if (left < right) {
            int mid = left + (right - left) / 2; 
            invCheck(arr, left, mid);
            invCheck(arr, mid + 1, right);
            merge(arr, left, right, mid, count);
    }
}
void merge(int arr[], int left, int right, int mid, int count){
        int size1 = mid-left+1;
        int size2 = right-mid;
        int[] arr1 = new int[size1];
        int[] arr2 = new int[size2];
        for(int i = 0;i<size1;i++){
            arr1[i] = arr[left + i];
        }
        for(int i = 0; i<size2;i++){
            arr2[i] = arr[mid+1+i];
        }int i = 0, j = mid+1;
        while(j<left){
        if(arr[i]<arr[j]&&i<mid){   
            count = count + 1;
            i++;
        }
        j++;
    }
}
}

public class InverionCount {
    
}
