class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();

        if (matrix == null || matrix.length == 0) {
            return ans;
        }

        int top = 0, bottom = matrix.length - 1;
        int left = 0, right = matrix[0].length - 1;

        while (top <= bottom && left <= right) {
            // Traverse from left to right
            for (int i = left; i <= right; i++) {
                ans.add(matrix[top][i]);
            }
            top++;

            // Traverse from top to bottom
            for (int i = top; i <= bottom; i++) {
                ans.add(matrix[i][right]);
            }
            right--;

            // Check if there are more rows to traverse
            if (top <= bottom) {
                // Traverse from right to left
                for (int i = right; i >= left; i--) {
                    ans.add(matrix[bottom][i]);
                }
                bottom--;
            }

            // Check if there are more columns to traverse
            if (left <= right) {
                // Traverse from bottom to top
                for (int i = bottom; i >= top; i--) {
                    ans.add(matrix[i][left]);
                }
                left++;
            }
        }

        return ans;
    }
}



// class Solution {
//     public List<Integer> spiralOrder(int[][] matrix) {
//         int row=matrix.length-1;
//         int col=matrix[0].length-1;
//         int m=0;
//         List<Integer> ans= new ArrayList<>();

//         while(m<=row){
//         for(int i=m;i<=col;i++){
//            ans.add(matrix[m][i]);
          
//         }
//         for(int i=m+1;i<=row;i++){
//             ans.add(matrix[i][row-m]);
//         }
//         for(int i=col-m-1;i>=m;i--){
//             ans.add(matrix[row-m][i]);
//         }
//         for(int i=m;i<row-m-1;i++){
//             ans.add(matrix[col-m-1][i]);
//         }
//         m++;
//     }
//     return ans;
//     }
// }