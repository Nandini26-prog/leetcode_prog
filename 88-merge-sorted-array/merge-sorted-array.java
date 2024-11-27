class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
     //both arrays are already sorted, else I would have sorted them.
        int left=m-1;
        int right=0;
        while(left>=0&&right<n){
            if(nums1[left]>nums2[right]){
                int temp=nums1[left];
                nums1[left]=nums2[right];
                nums2[right]=temp;

                left--;
                right++;
            }
            else break;
        }
            Arrays.sort(nums1, 0, m); // Sort only the valid part of nums1
        Arrays.sort(nums2);
        for(int i=0;i<n;i++){
            nums1[i+m]=nums2[i];
        }
     

     //BRUTE FORCE  

    //     int i = m - 1; 
    //     int j = n - 1; 
    //     int k = m + n - 1; 

     
    //     while (i >= 0 && j >= 0) {
    //         if (nums1[i] > nums2[j]) {
    //             nums1[k--] = nums1[i--]; // putting largest on its largest place only
    //         } else {
    //             nums1[k--] = nums2[j--];
    //         }
    //     }

    
    //     while (j >= 0) {
    //         nums1[k--] = nums2[j--];
    //     }
     }
}
