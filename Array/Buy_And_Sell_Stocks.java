package Array;

public class Buy_And_Sell_Stocks {
    public static void main(String[] args) {
        int[] prices = { 7, 1, 5, 3, 6, 4 };
        int[] prices1 = { 748, 205, 56, 799, 644, 291, 22, 642, 123, 736, 201, 804, 27, 69, 161, 296,
                156, 787, 486, 812, 379, 358, 29, 63, 880, 961, 494, 632, 270, 559, 623, 669, 452, 547,
                48, 651, 925, 916, 620, 594, 798, 111, 328, 789, 856, 520, 790, 526, 804, 507, 69, 979,
                954, 717, 558, 987, 741, 603, 583, 875, 690, 336, 850, 864, 653, 818, 2, 752, 685, 611,
                111, 830, 512, 637, 834, 504, 570, 716, 935, 473, 666, 601, 820, 334, 851 };
        int[] prices3 = { 7, 6, 4, 3, 1 };
        buy_sell_stocks BSS = new buy_sell_stocks();
        int profit = BSS.max_profit(prices1);
        System.out.println(profit);

    }
}

class buy_sell_stocks {
    public int max_profit(int[] prices) {
        int buying_price = prices[0];
        int max_pro = 0;

        for (int i = 0; i < prices.length; i++) {
            int curr = prices[i];
            max_pro = Math.max(max_pro, curr - buying_price);
            if (curr < buying_price) {
                buying_price = curr;
            }
        }
        return max_pro;
    }
}
