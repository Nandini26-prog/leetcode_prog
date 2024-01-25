class Solution {
    public int[] plusOne(int[] digits) {
       for(int i=digits.length-1;i>=0;i--){
           if(digits[i]<9)
           {digits[i]++;
            return digits;}
            digits[i]=0;
       }
       digits=new int[digits.length+1];
       digits[0]=1; //since all other are having 0 by default only
       return digits;
    }
}