class Solution {

    int count;
    public int reversePairs(int[] nums) {
        //reverse pair means: first element should be larger than twice of second number
        count=0;
        merge(nums,0,nums.length-1);
        return count;

    }

    public int[] merge(int[] nums, int left, int right){
        if(left==right)
            {
                return new int[] {nums[left]};
            }

        int mid=left+(right-left)/2;
        int[] m1= merge(nums,left,mid);
        int[] m2= merge(nums,mid+1,right);

        int j=0;
        for(int i=0;i<m1.length;i++){
            while(j<m2.length && 2*(long)m2[j] < m1[i])
                j++;
            count+=j;
        }

        int [] merged= new int[right-left+1];
        int p=0;
        int i=0;
        j=0;
        while(i<m1.length||j<m2.length){
            if(i<m1.length && j<m2.length)
                merged[p++]=m1[i]<=m2[j]?m1[i++]:m2[j++];
            else if(i<m1.length)
                merged[p++]=m1[i++];
            else
                merged[p++]=m2[j++];
        }
        return merged;
    }
}