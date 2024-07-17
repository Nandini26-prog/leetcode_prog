class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
    List<List<Integer>> result = new ArrayList<>();
        
        // Sort the array
        Arrays.sort(nums);
        
        // Iterate through each element (consider it as the first element of the triplet)
        for (int i = 0; i < nums.length - 2; i++) {
            // Skip duplicates for the first element of the triplet
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            
            int left = i + 1; // Pointer to the second element of the triplet
            int right = nums.length - 1; // Pointer to the third element of the triplet
            
            // Two pointer approach
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                
                if (sum == 0) {
                    // Found a triplet whose sum is zero
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    
                    // Skip duplicates for the second element of the triplet
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    
                    // Skip duplicates for the third element of the triplet
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }
                    
                    // Move pointers inward
                    left++;
                    right--;
                } else if (sum < 0) {
                    // Need to increase the sum, move left pointer to the right
                    left++;
                } else {
                    // Need to decrease the sum, move right pointer to the left
                    right--;
                }
            }
        }
        
        return result;
    }
}