class Solution {
    int dir[][]= new int[][]{{-1,-1},{-1,0},{-1,1},{0,-1},{0,1},{1,-1},{1,0},{1,1}};
    public void gameOfLife(int[][] board) {
        int row=board.length;
        int col=board[0].length;

        int [][]ans=new int [row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                int count=0;
                for(int[] d:dir){
                    int p=i+d[0];
                    int q=j+d[1];

                    if(p>=0&&p<row && q>=0&&q<col && board[p][q]==1)
                        count++;
                }

                if(board[i][j]==1){
                    if(count==2||count==3)
                        ans[i][j]=1;
                }
                else{
                    if(count==3)
                        ans[i][j]=1;
                }
            }
        }
          for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                board[i][j]=ans[i][j];
            }
          }
    }
}