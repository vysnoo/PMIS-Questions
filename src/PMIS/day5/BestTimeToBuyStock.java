package PMIS.day5;

public class BestTimeToBuyStock {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));

    }

    static public int maxProfit(int[] prices) {
        int buy = prices[0];
        int profit = 0;
        int n = prices.length;
        for(int i=1;i<n;i++){
            if(prices[i]<buy){
                buy = prices[i];
                continue;
            }

            profit =  Math.max(profit,prices[i]-buy);


        }
        return profit;
    }
}
