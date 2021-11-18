package com.company.Arrays;

public class Best_Time_to_Buy_sell_Stock
{
    public static int maxProfit(int[] prices) {


        int min  = Integer.MAX_VALUE;
        int profit = 0;

        for(int i=0 ; i<prices.length ; i++)
        {
            if(min > prices[i])
            {
                min = prices[i];
            }
            else if(prices[i] - min > profit)
            {
                profit = prices[i] - min;
            }
        }

        return profit;
    }

    public static void main(String[] args) {
        int arr[] = {3,2,6,5,0,3};

        System.out.println("Max Profit : "+maxProfit(arr));
    }
}
