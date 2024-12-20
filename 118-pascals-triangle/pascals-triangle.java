class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> tri=new ArrayList<>();
        for(int i=1;i<=numRows;i++){
            List<Integer> row=new ArrayList<>();
            int ans=1;
            row.add(ans);
            for(int j=1;j<i;j++){
                ans=ans*(i-j);
                ans=ans/j;
                row.add(ans);
            }
            tri.add(row);
        }
        return tri;
    }
}