class Solution {
    public int findMaxValueOfEquation(int[][] points, int k) {
         int maxValue = Integer.MIN_VALUE;
        // Max-Heap based on the value (yi - xi)
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> Integer.compare(b[0], a[0]));

        for (int[] point : points) {
            int xj = point[0];
            int yj = point[1];

            // Remove points where xi < xj - k
            while (!pq.isEmpty() && xj - pq.peek()[1] > k) {
                pq.poll();
            }

            // Calculate the max value if there are valid points in the heap
            if (!pq.isEmpty()) {
                int[] top = pq.peek();
                int currentMaxValue = yj + xj + top[0];
                maxValue = Math.max(maxValue, currentMaxValue);
            }

            // Push the current (yi - xi, xi) into the heap
            pq.offer(new int[]{yj - xj, xj});
        }

        return maxValue;
    }
}