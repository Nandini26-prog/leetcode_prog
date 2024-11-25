class Solution {
    public int[][] merge(int[][] intervals) {
         int n = intervals.length; // size of the array
        //sort the given intervals:
       Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        // Step 2: Use a list to store the merged intervals
        List<int[]> merged = new ArrayList<>();

        for (int[] interval : intervals) {
            // If the merged list is empty or no overlap, add the interval directly
            if (merged.isEmpty() || merged.get(merged.size() - 1)[1] < interval[0]) {
                merged.add(interval);
            } else {
                // If there is overlap, merge intervals by updating the end time
                merged.get(merged.size() - 1)[1] = Math.max(merged.get(merged.size() - 1)[1], interval[1]);
            }
        }

        // Convert the list to an array and return
        return merged.toArray(new int[merged.size()][]);
    }


    }
