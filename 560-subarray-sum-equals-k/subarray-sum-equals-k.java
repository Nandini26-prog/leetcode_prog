class Solution {
    public int subarraySum(int[] nums, int k) {
        int count=0;
        int sum=0;
        HashMap<Integer,Integer> prefix= new HashMap<>(); 

        prefix.put(0,1);
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
            if(prefix.containsKey(sum-k)){
                count+=prefix.get(sum-k); //to get frequency 
            }
            prefix.put(sum,prefix.getOrDefault(sum,0)+1);
        }
        return count;
    }
}