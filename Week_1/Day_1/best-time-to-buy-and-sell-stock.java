class Solution {
    public int maxProfit(int[] prices) {
        int Buy = prices[0];
        int Profit = 0;
        int n = prices.length;
        for(int i =0;i<n ;i++){
            if(prices[i]<Buy){
                Buy=prices[i];
            }
            else if (prices[i]-Buy > Profit){
                Profit = prices[i]-Buy;
            }
        } 
        return Profit;
    }
}
