package Array;

public class BestTimeToBuyAndSellStock_121 {
    public  int maxProfit(int[] prices) {
        int max=0;
        for (int i = 0, j= 0; i < prices.length; i++) {
            int tempmax =prices[i] -prices[j];
            if(max<tempmax){
                max = tempmax;
            }
            if(prices[j]>prices[i]){
                j=i;
            }

        }
        return max;
    }

}
