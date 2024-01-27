import java.util.Arrays;
class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        for(int i=0;i<arr.length-2;i++){
            int diff1=arr[i+1]-arr[i];
            int diff2=arr[i+2]-arr[i+1];
            if(diff2!=diff1) return false;
        }
        return true;
    }
}