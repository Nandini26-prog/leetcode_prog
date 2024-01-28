import java.util.*;
class Solution {
    public String toLowerCase(String s) {
        int a;
        StringBuilder n= new StringBuilder();
        for(int i=0;i<s.length();i++){
            a=s.charAt(i);
            if(a>=65 &&a<=90){
                a=a+32;
               char c=(char)a;
               n.append(c);
            }
            else{
                n.append(s.charAt(i));
            }
        }
        return n.toString();
    }
}