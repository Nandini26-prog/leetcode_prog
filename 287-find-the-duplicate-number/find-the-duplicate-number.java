class Solution {
    public int findDuplicate(int[] nums) {
        int n=nums.length;
        int ans=0;
        int[] dp=new int[n];
           for(int i=0;i<n;i++){
            dp[i]=0;
        }
        for(int i=0;i<n;i++){
            dp[nums[i]]++;
        }
        for(int i=0;i<dp.length;i++){
            if(dp[i]>1)
                ans=i;
        }
        return ans;
    }
}