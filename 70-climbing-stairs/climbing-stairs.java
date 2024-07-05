class Solution {
    public int climbStairs(int n) {
        //since there is given we can teake max upto 2 stairs hence fibonacci
        int dp[]=new int[n+1];
        dp[0]=1;
        dp[1]=1;
        if(n==1||n==0) {
            return 1;
        }
        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
       // return climbStairs(n-1)+climbStairs(n-2);
       return dp[n];
        
    }
}