package day1_DSA;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;

public class Best_Time_to_Buy_and_Sell_Stock
{
    public static void main(String[] args)
    {
         Best_Time_to_Buy_and_Sell_Stock bs = new Best_Time_to_Buy_and_Sell_Stock();
         int[] nums = {7,6,4,3,1}; //{7,1,5,3,6,4};
         int res = bs.maxProfit(nums);
         System.out.println("Result:- " + res); // 5
    }

    public int maxProfit(int[] prices)
    {
        int maxprofit = 0;
        int min_price = prices[0];

        for(int i=1;i<prices.length;i++)
        {
          if(min_price > prices[i])
          {
              min_price = prices[i];
          }
          maxprofit = Math.max(maxprofit, prices[i] - min_price);
        }
        return maxprofit;
    }
}
