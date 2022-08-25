public class trading {

    public static void main(String args[]) {

        int profit = 0;
//        int[] prices = {7, 1, 5, 3, 6, 4};
//        int[] prices = {1, 2, 3, 4, 5};
        int[] prices = {7,6,4,3,1};

        if (prices.length >= 1) {
            for (int i = 1; i < prices.length; i++) {
                if (prices[i] > prices[i-1]) {
                    profit += prices[i] - prices[i-1];
                }
            }
        }
        System.out.println("Profit is : " + profit);
    }
}
