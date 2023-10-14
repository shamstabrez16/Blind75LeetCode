package Array;

public class BestTimeToBuyAndSellStock_121 {
    public static void main(String[] args) {
        int[]  prices ={7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
    public static int maxProfit(int[] prices) {
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
