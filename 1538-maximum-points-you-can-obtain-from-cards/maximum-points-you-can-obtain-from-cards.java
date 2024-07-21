class Solution {
    public int maxScore(int[] cardPoints, int k) {

        int n = cardPoints.length;
        int total = 0;

        for (int i = 0; i < k; i++) {
            total += cardPoints[i];
        }

        int maxScore = total;

        // Replace cards from the start with cards from the end one by one.
        for (int i = 0; i < k; i++) {
            total += cardPoints[n - 1 - i] - cardPoints[k - 1 - i];
            maxScore = Math.max(maxScore, total);
        }

        return maxScore;
    }
}


        // int max=Integer.MIN_VALUE;
        // int sum=0;
        // int count=0;
        // for(int i=0;i<cardPoints.length;i++){
        //     int left=i;
        //     int right=cardPoints.length-1;
        //     while(left<right&&count<k){
        //     if(cardPoints[left]>cardPoints[right]){
        //         sum+=cardPoints[left];
        //         left++;
        //         count++;
        //     }
        //     else{
        //         sum+=cardPoints[right];
        //         right--;
        //         count++;
        //     }
        //     }
        // }
        // return sum;
//     }
// }