class MaxProfitSolution {
    public int maxProfit(int[] prices) {
        int res = 0, minPrice = prices[0];
        for (int price : prices) {
            res = Math.max(res, price - minPrice);
            minPrice = Math.min(price, minPrice);
        }
        return res;
    }
}

// leetcode url: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
public class p_121 {
    public static void main(String[] args) {
        int[] nums = { 7, 1, 5, 3, 6, 4 };
        MaxProfitSolution solution = new MaxProfitSolution();
        int result = solution.maxProfit(nums);
        System.out.println("The result is: " + result);
    }
}
