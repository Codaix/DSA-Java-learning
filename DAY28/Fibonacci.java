package DAY28;

public class Fibonacci {
    int helper(int n, int arr[]){
        if(n<=1) return 1;
        if(arr[n] != -1);
        return arr[n] = helper(n-1, arr) + helper(n-2, arr);

    }


    int fib(int n){
        int arr[]= new int[n+1];
        return helper(n, arr);

    }
    
    
}
