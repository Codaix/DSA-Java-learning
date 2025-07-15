package DAY28;
//Que: we have n and can perform minus divide and modulo.. we need to give min number of operations to move it to one.
public class Que {
        int helper(int n, int dp[]){
            if(n <= 1) return 0;
            if(dp[n] != -1) return dp[n];
            int r = Integer.MAX_VALUE;
            r = Math.min(r, helper(n - 1, dp));
            if(n % 2 == 0) r = Math.min(r, helper(n / 2, dp));
            if(n % 3 == 0) r = Math.min(r, helper(n / 3, dp));
            return dp[n] = 1 + r;
            }
            
    int minOp(int n){
        if(n <=1) return 0;
        int dp[] = new int[n+1];
        helper(n,dp);
        return dp[n];
    }
}
