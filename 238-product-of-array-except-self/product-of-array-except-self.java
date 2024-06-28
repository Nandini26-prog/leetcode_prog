class Solution {
    public int[] productExceptSelf(int[] nums) {

        int[] answer=new int[nums.length];
        int prefix=1,suffix=1;
        
        //for prefix
        for(int i=0;i<nums.length;i++){
            answer[i]=prefix;
            prefix=prefix*nums[i];
        }
        //for suffix
        for(int i=nums.length-1;i>=0;i--){
            answer[i]*=suffix;
            suffix=suffix*nums[i];
        }
        return answer;

        //*O(n^2) solution

    //     int[] answer=new int[nums.length];
    //     int prod=1;
    //     for(int i=0;i<nums.length;i++){
    //         prod=1;
    //         for(int j=0;j<nums.length;j++){
    //             if(i==j) continue;
    //             else{
    //                 prod=prod*nums[j];
    //             }
    //         }
    //     answer[i]=prod;
        
    //     }
    //  return answer;
    }
}