package DAY17;
// given a sorted array. it got rotated to a random index. lets we have a target x.. look in the array and check if it is possible find the target.

// brute force: we iterate to each element and compare the target...
class bruteForce{
    boolean checkTarget(int arr[], int x){
        boolean ans = true;
        for (int i = 0; i<arr.length; i++){
            if(arr[i] == x){
                ans = true;
            }
            ans = false;
        }
        return ans;
    }
}
class checkTarget{
    boolean check(int arr[], int t){
        int s = 0;
        int e = arr.length-1;
        while(s <= e){
            int mid = s+(e-s)/2;
            if(arr[mid] == t)return true;
            if(arr[mid] > arr[s]){
                if(arr[s] <= t && t < arr[mid]){
                    e = mid-1;
                }else s = mid+1;
            }else{
                if(arr[mid] < t && t >= arr[e]){
                    s = mid+1;
                }else e = mid-1;
            }
        }
        return false;
        


    }
}
public class que {
    
}
