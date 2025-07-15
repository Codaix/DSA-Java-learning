package DAY28;
// A child is standing at ground and wants to go up on the stairs. He can go either one stair at a time, two stair at a time or three stairs at a time. we need to get the 
// number of ways he can go up on the stairs.
public class Que2 {
    int helper(int n, int dp[]){
        if(n <= 3) return n;
        if(dp[n] != -1) return dp[n];
        int w1 = helper(n-1, dp);
        int w2 = helper(n-2, dp);
        int w3 = helper(n-3, dp);
        return dp[n] = w1 + w2 + w3;
    }
    int waysToClimb(int n){
        if(n == 0) return 1;
        if(n <= 3) return n;
        int w1 = waysToClimb(n-1);
        int w2 = waysToClimb(n-2);
        int w3 = waysToClimb(n-3);
        return w1+w2+w3;
    }
    
}
