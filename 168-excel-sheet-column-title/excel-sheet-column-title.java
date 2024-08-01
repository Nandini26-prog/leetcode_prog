class Solution {
    public String convertToTitle(int columnNumber) {

        if (columnNumber == 0) {
            return "";
        }
        
        columnNumber--; // Adjust for 1-based indexing

        char currentChar = (char) ('A' + (columnNumber % 26));

        return convertToTitle(columnNumber / 26) + currentChar;
        //ASCII value A:65-Z:90  '@':64
        // StringBuilder res=new StringBuilder();
        // if(columnNumber<=26){
        //     res.append(64+(char)(columnNumber));
        // }
        // else convertToTitle(columnNumber-26);
        // return res.toString();
    }
}