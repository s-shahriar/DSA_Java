package Array;

public class BestTimeToBuyAndSellStock {

    public static int maximumProfit(int[] stockPrices) {
        int length = stockPrices.length;  // Length of the stockPrices array

        int buyingPrice = Integer.MAX_VALUE;  // Start with the maximum possible value for buying price
        int maxProfit = 0;  // Initialize the max profit to 0

        // Traverse the array to find the maximum profit
        for (int i = 0; i < length; i++) {

            // If current price is greater than buying price, calculate profit
            if (buyingPrice < stockPrices[i]) {
                int profit = stockPrices[i] - buyingPrice;  // Profit is current price minus buying price
                maxProfit = Math.max(maxProfit, profit);  // Update the max profit
            } else {
                // If the current price is lower than buying price, update buying price
                buyingPrice = stockPrices[i];  // New buying price is the current price
            }
        }

        return maxProfit;  // Return the maximum profit found
    }

    public static void main(String[] args) {
        int stockPrices[] = {7, 1, 5, 3, 6, 4};  // Example input array of stock prices

        int ans = maximumProfit(stockPrices);  // Get the maximum profit
        System.out.println("Maximum Profit = " + ans);  // Output the result
    }
}

/*
 +----------------------------------------+
 |               START                    |
 +----------------------------------------+
                          |
                          v
 +-----------------------------------------------+
 |  INPUT: stockPrices[] array (e.g., {7, 1, 5, 3, 6, 4})  |
 +-----------------------------------------------+
                          |
                          v
 +-----------------------------------------------+
 |  1. Initialize variables:                     |
 |     - Let `buyingPrice = Integer.MAX_VALUE`   |
 |     - Let `maxProfit = 0`                     |
 +-----------------------------------------------+
                          |
                          v
 +-----------------------------------------------+
 |  2. Traverse the `stockPrices` array:         |
 |     - For each price, compare it with the current buyingPrice. |
 |     - If the price is higher than buyingPrice, compute profit.  |
 |     - If the price is lower, update buyingPrice to the current price. |
 +-----------------------------------------------+
                          |
                          v
 +-----------------------------------------------+
 |  3. Compute the maximum profit:               |
 |     - Update `maxProfit` whenever a higher profit is found. |
 +-----------------------------------------------+
                          |
                          v
 +-----------------------------------------------+
 |  OUTPUT: Maximum Profit (e.g., 5).            |
 +-----------------------------------------------+
                          |
                          v
 +----------------+
 |     END        |
 +----------------+
*/
