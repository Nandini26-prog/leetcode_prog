class Solution {
 public List<Integer> countSmaller(int[] nums) {
        int n = nums.length;
        List<Integer> ans = new ArrayList<>();
        if (n == 0) return ans;

        // Step 1: Coordinate compression
        int[] sortedNums = nums.clone();
        Arrays.sort(sortedNums);

        Map<Integer, Integer> rankMap = new HashMap<>();
        int rank = 1;
        for (int num : sortedNums) {
            if (!rankMap.containsKey(num)) {
                rankMap.put(num, rank++);
            }
        }

        // Initialize BIT (size n + 1 for 1-based index)
        int[] BIT = new int[n + 1];

        // Step 2: Traverse from right to left in nums array
        for (int i = n - 1; i >= 0; i--) {
            int currentRank = rankMap.get(nums[i]); // Use a different variable name
            ans.add(query(BIT, currentRank - 1));  // Query the BIT for counts of smaller elements
            update(BIT, currentRank, 1);           // Update the BIT with the current element's rank
        }

        // Since we collected results in reverse order, reverse the list
        Collections.reverse(ans);
        return ans;
    }

    // Helper function to update the BIT
    private void update(int[] BIT, int index, int value) {
        while (index < BIT.length) {
            BIT[index] += value;
            index += index & -index;
        }
    }

    // Helper function to query the BIT
    private int query(int[] BIT, int index) {
        int sum = 0;
        while (index > 0) {
            sum += BIT[index];
            index -= index & -index;
        }
        return sum;
    }
}
        // HashMap<Integer, Integer> ref= new HashMap<>();
        // int[] temp=new int[nums.length];
        // for(int i=0;i<nums.length;i++)
        //      temp[i]=nums[i];
        //  Arrays.sort(temp);

        // for(int i=temp.length-1;i>=0;i--){
        //     ref.put(temp[i],i);
        // }
        // for(int i=0;i<nums.length;i++){
        //     ans.add(ref.get(nums[i]));
        // }
        //return ans;
    