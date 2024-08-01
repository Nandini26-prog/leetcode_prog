class Solution {
    public void rotate(int[][] matrix) {
        //first create a transpose then swap
        int row=matrix.length;
        int col=matrix[0].length;
        int temp;
        for(int i=0;i<row;i++){
            for(int j=0;j<i;j++){
                temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        for(int j=0;j<col/2;j++){
        for(int i=0;i<row;i++){
            temp=matrix[i][j];
            matrix[i][j]=matrix[i][col-j-1];
            matrix[i][col-j-1]=temp;
        }
        }
    }
}