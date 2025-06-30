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
    boolean check(int arr[], int x){
        


    }
}
public class que {
    
}
