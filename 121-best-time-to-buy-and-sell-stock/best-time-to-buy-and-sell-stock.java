class Solution {
    public int maxProfit(int[] arr) {
         int maxPro = 0;
    int minPrice = Integer.MAX_VALUE;
    for (int i = 0; i < arr.length; i++) {
        minPrice = Math.min(minPrice, arr[i]);
        maxPro = Math.max(maxPro, arr[i] - minPrice);
    }
    return maxPro;
        
        // int maxprofit=0;
        // int leastprice=prices[0];

        // for(int i=0;i<prices.length;i++){
        //     if(prices[i]<leastprice)
        //         leastprice=prices[i];
        //     else if(prices[i]-leastprice>maxprofit){
        //         maxprofit=prices[i]-leastprice;
        //     }
    
        // }
       
        // return maxprofit;
    }
}