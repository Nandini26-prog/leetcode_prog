class Solution {
    public boolean judgeCircle(String moves) {
        int count1=0, count2=0;
        for(int i=0;i<moves.length();i++){
            if(moves.charAt(i)=='R')   count1++;
            else if(moves.charAt(i)=='L') count1--;
            else if(moves.charAt(i)=='U')   count2++;
            else count2--;
        }
        if(count1==0 && count2==0)
            return true;
        else return false;
    }
}