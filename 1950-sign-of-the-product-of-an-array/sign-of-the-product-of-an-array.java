
class Solution {
    public int arraySign(int[] nums) {
      //  int prod=1;
        int prod = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                return 0;
            }
            prod = prod * (nums[i] > 0 ? 1 : -1);
        }
        return prod;
    }
}