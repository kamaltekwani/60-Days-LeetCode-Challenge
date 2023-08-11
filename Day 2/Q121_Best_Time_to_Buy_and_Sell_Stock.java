/*
 * Problem Link : https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 * Solution Link : https://leetcode.com/problems/best-time-to-buy-and-sell-stock/solutions/2433981/easy-100-kadane-s-algorithm-java-c-python-js-python3-min-so-far/
 *
 * Time Complexity : O(N)
 * Space Complexity : O(1)
 */

class Q121_Best_Time_to_Buy_and_Sell_Stock
{
    public int maxProfit(int[] prices) 
    {
        int profit = 0;
        int buy = prices[0];

        for(int index=1 ; index<prices.length ; index++)
        {
            profit = Math.max(profit, prices[index]-buy);
            buy = Math.min(buy, prices[index]);
        }
        return profit;
    }
}
