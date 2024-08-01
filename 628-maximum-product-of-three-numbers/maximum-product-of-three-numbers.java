class Solution {
    public int maximumProduct(int[] nums) {
           Arrays.sort(nums);
        int n = nums.length;
        
        // Maximum of either:
        // 1. Product of three largest numbers
        // 2. Product of two smallest numbers (which could be negative) and the largest number
        int max1 = nums[n - 1] * nums[n - 2] * nums[n - 3];
        int max2 = nums[0] * nums[1] * nums[n - 1];
        
        return Math.max(max1, max2);
    //   return prod;
    //     int prod=1;
    //     Arrays.sort(nums);
    //     if(nums[nums.length-1]<=0)
    //         prod=prod*nums[0]*nums[1]*nums[2];
    //     else
    //          prod=prod*nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3];
    //   return prod;
    }
}