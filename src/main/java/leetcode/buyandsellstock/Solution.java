package leetcode.buyandsellstock;

public class Solution {
  public int maxProfit(int[] prices) {
    if (prices.length == 0) {
      return 0;
    }

    // [7, 1, 5, 3, 6, 4]
    // [7] => 0, min=7
    // [7, 1] => 0, min=1
    // [7, 1, 5] => 4, min=1
    // [7, 1, 5, 3] => 4, min=1
    // [7, 1, 5, 3, 6] => 5, min=1
    // [7, 1, 5, 3, 6, 4] => 5, min=1
    int maxProfit = 0;
    int minBuy = prices[0];
    for (int i = 1; i < prices.length; i++) {
      final int price = prices[i];
      if (price > minBuy) {
        // That means we can sell.
        maxProfit = Math.max(price - minBuy, maxProfit);
      }
      minBuy = Math.min(minBuy, price);
    }
    return maxProfit;
  }

  int maxProfitNonOptimally(final int[] prices) {
    int maxProfit = 0;
    for (int i = 0; i < prices.length; i++) {
      for (int j = i + 1; j < prices.length; j++) {
        int buy = prices[i];
        int sell = prices[j];
        if (sell > buy) {
          int profit = sell - buy;
          if (profit > maxProfit) {
            maxProfit = profit;
          }
        }
      }
    }
    return maxProfit;
  }
}
