public class Solution {
    public static int bestTimeToBuyAndSellStock(int []prices) {
        // Write your code here.
        int min = Integer.MAX_VALUE;

        int max =0;

        

        for (int i = 0; i < prices.length; i++) {

            min = Math.min(min, prices[i]);

            max = Math.max(max, prices[i] - min);

        }

        return max;

    }

}
