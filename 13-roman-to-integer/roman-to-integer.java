class Solution {
    public int romanToInt(String s) {
        int sum=0;
        int diff=0;
        if(s.length()==1){
            sum=value(s.charAt(0));
            return sum;
        }
        else{
        for(int i=0;i<s.length()-1;i++){
            if(value(s.charAt(i))>=value(s.charAt(i+1)))
                sum=sum+value(s.charAt(i));
            else{
                diff=value(s.charAt(i+1))-value(s.charAt(i));
                sum=sum+diff;
                i++;
            }
        }
       // if(s.length()>=2){
        if(value(s.charAt(s.length()-1))<=value(s.charAt(s.length()-2)))
            sum=sum+value(s.charAt(s.length()-1));
        }
        // else{
        //     diff=value(s.charAt(s.length()-1))-value(s.charAt(s.length()-2));
        //     sum=sum+diff;
        // }
        return sum;
    }
    public int value(char s){
        if(s=='I')    return 1;
        else if(s=='V')   return 5;
        else if(s=='X')   return 10;
        else if(s=='L')   return 50;
        else if(s=='C')   return 100;
        else if(s=='D')   return 500;
        else if(s=='M')   return 1000;
    else return 0;}
}