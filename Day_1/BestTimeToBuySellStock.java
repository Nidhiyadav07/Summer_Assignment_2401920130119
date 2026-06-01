public class BestTimeToBuySellStock {
     public int maxProfit(int[] prices) {

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {

            if (price < minPrice) {
                minPrice = price;
            } else {
                maxProfit = Math.max(maxProfit, price - minPrice);
            }
        }

        return maxProfit;
    }
      public static void main(String[] args) {

        int[] prices = {7, 1, 5, 3, 6, 4};

        BestTimeToBuySellStock obj = new BestTimeToBuySellStock();

        int result = obj.maxProfit(prices);

        System.out.println("Maximum Profit: " + result);
    }
}
