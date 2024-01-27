class Solution {
    public boolean isMonotonic(int[] nums) {
        int countf=1;
        int countr=1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i+1]>=nums[i])
                countf++;
            if(nums[i+1]<=nums[i])
                countr++;
        }
        if(countf==nums.length||countr==nums.length)
        return true;
        else return false;
    }
}