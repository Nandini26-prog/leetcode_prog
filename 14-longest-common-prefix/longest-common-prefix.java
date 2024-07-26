class Solution {
    public String longestCommonPrefix(String[] strs) {
   if (strs == null || strs.length == 0) {
            return ""; // Handle empty array case
        }
        
        String com = strs[0]; // Initialize with the first string
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(com) != 0) { //The indexOf method in Java returns the index of the first occurrence of a specified substring within a string. If the substring is not found, it returns -1.
                com = com.substring(0, com.length() - 1);
                if (com.isEmpty()) {
                    return ""; // If no common prefix, return empty string
                }
            }
        }
        return com;
    }
}