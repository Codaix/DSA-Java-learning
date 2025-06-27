package DAY16;
// we are given a number. we need to give the square root of nearest perfect square.
// if num = 10, we need to retrun 3 cause 9 is the nearest perfect square.
//linear search brute force
class GetNum{
    int Square(int num){
        if(num<=3)return 1;
        int ans = -1;
        for(int i =1; i<=num/2;i++){
            if((i*i)>num){
                break;
            }
            ans = i;
        }
        return ans;

    }
}
// assignment: implement using binary
//binary : check mid. if greater than num, we not need to do anything. if less, store mid.

// ask binary search.. look from mid+1 and check if there exist a number near to the num 
public class Ques2 {
    int n = 0;

    
}
