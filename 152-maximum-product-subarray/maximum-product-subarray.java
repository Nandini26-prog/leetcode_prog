class Solution {
    public int maxProduct(int[] nums) {

        // int highest=nums[0];
       
        // for(int i=0;i<nums.length-1;i++){
        //     int prod=nums[i];
        //     if(nums[i]==0){
        //        i++;
        //     }
        //     for(int j=i+1;j<nums.length;j++){
        //       highest=Math.max(highest,prod);
        //       prod=prod*nums[j];
        //     }
        // highest=Math.max(highest,prod);
        // }
        // return highest;

    
    if (nums == null || nums.length == 0) {
        return 0;
    }
    
    int result = Integer.MIN_VALUE;
    int currentMax = 1;
    int currentMin = 1;
    
    for (int i = 0; i < nums.length; i++) {
        int num = nums[i];
        
        if (num < 0) {
            int temp = currentMax;
            currentMax = currentMin;
            currentMin = temp;
        }
        
        currentMax = Math.max(num, currentMax * num);
        currentMin = Math.min(num, currentMin * num);
        
        result = Math.max(result, currentMax);
        
        // Handle the case where currentMax becomes zero (reset)
        if (currentMax == 0) {
            currentMax = 1;
            currentMin = 1;
        }
    }
    
    return result;
}

}