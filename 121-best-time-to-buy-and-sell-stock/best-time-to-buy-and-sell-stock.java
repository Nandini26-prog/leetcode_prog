class Solution {
    public int maxProfit(int[] prices) {
        
        int maxprofit=0;
        int leastprice=prices[0];

        for(int i=0;i<prices.length;i++){
            if(prices[i]<leastprice)
                leastprice=prices[i];
            else if(prices[i]-leastprice>maxprofit){
                maxprofit=prices[i]-leastprice;
            }
    
        }
       
        return maxprofit;
    }
}