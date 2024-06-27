class Solution {
    public int maxArea(int[] height) {
        // int n=height.length;
        // int area;
        // int max=height[0];
        // for(int i=0;i<n-1;i++){
        //     for(int j=i+1;j<n;j++){
        //         if(height[i]<height[j]){
        //             area=height[i]*(j-i);
        //         }
        //         else area=height[j]*(j-i);
        //         max=Math.max(max,area);
        //     }
        // }
        // return max;

       int n = height.length;
        int maxArea = 0;
        int left = 0;
        int right = n - 1;
        
        while (left < right) {
            int currentArea = Math.min(height[left], height[right]) * (right - left);
            maxArea = Math.max(maxArea, currentArea);
            
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        
        return maxArea;
       
    }
}