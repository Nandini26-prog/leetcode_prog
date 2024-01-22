import java.util.Arrays;
class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sch=s.toCharArray();
        char[] tch=t.toCharArray();

        Arrays.sort(sch);
        Arrays.sort(tch);

        return Arrays.equals(sch,tch);
    }
    }
