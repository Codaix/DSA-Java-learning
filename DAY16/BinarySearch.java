package DAY16;

public class BinarySearch {
    boolean binarySearch(int arr[], int t){
    int s = 0;
    int e = arr.length-1;
    while(s<= e){
        int mid = s+(e-s)/2;
        if(arr[mid] == t)return true;
        if(arr[mid]>t){
            e = mid-1;

        }else{
            s = mid+1;

        }
    }
    return false;
    }

    
}
