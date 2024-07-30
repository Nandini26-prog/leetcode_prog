class Solution {
    public String reverseWords(String s) {
        String[] parts=s.split(" ");
        StringBuilder ans=new StringBuilder();
        for(int i=parts.length-1;i>=0;i--){
            if(parts[i].equals(""))
                continue;
            ans.append(parts[i]).append(" ");
        }
        ans.deleteCharAt(ans.length()-1);  //to remove the last extra space
        return ans.toString();
    }
}