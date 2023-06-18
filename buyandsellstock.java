class buyandsellstock {
    public static int maxProfit(int[] prices) { // prices = [ 7 , 1, 5 , 3, 6, 4]
        if (prices == null || prices.length == 0) {
            return 0; // if prices =[] then we cant buy or sell stocks , so return 0
        }

        int profit = 0; // initialising profit with 0
        int buying_price = prices[0]; // initialising the buying price to be the first element of prices array
        // [7,1,5,3,6,4] => buying_price = 7
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] <= buying_price) { // prices [1] => 1 < buying_price => 1< 7 (true) | prices [2] => 5 <
                                             // buying_price => 5<1 (false) | prices [3] => 3<1(false)| prices [4]
                                             // =>6<1(false)|price [5] =>4<1(false)
                buying_price = prices[i]; // 1
                continue;

            }
            profit = Math.max(profit, prices[i] - buying_price); // (0,1-1) = 0 | (0,5-1) = 4 |(4,3-1) = 4| (4,6-1) = 5|
                                                                 // (5,4-1) = 5

        }
        return profit; // 5
    }

    public static void main(String[] args) {
        int[] prices = { 7, 1, 5, 3, 6, 4 };
        int profit = maxProfit(prices);
        System.out.println(profit);
    }
}