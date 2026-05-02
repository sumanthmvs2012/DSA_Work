package day1_DSA;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;

public class Best_Time_to_Buy_and_Sell_Stock
{
    public static void main(String[] args)
    {
         Best_Time_to_Buy_and_Sell_Stock bs = new Best_Time_to_Buy_and_Sell_Stock();
         int[] nums = {7,1,5,3,6,4};
         int res = bs.maxProfit(nums);
         System.out.println("Result:- " + res);
    }

    public int maxProfit(int[] prices)
    {
        int maxprofit = 0;
        int min_price = prices[0];
        ArrayList<Integer> al = new ArrayList<>();

        for(int i=0;i<prices.length;i++)
        {

        }
        return 0;
    }
}
