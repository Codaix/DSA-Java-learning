
package DAY16;
// given an integer array arr[] and int t target. 
// we need to get the last occurrance of t.
class Search{
int lastOccur(int arr[], int t){
    int ans = -1;
    int left = 0;
    int right = arr.length-1;
    while(left<= right){
        int mid = left+(right-left)/2;
        if(arr[mid] == t){
            ans = mid;
            left = mid+1;
        }
        else if(arr[mid] > t){
            right = mid-1;

        }
        else{
            left = mid+1;

        }
    }
    return ans;
}
}
public class Question {
    int arr[] = new int[999];
    int t = 3;
    Search obj = new Search(); 
}
