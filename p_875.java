import java.util.Arrays;

class MinEatingSpeedSolution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1;
        int r = Arrays.stream(piles).max().getAsInt();
        int res = r;

        while (l <= r) {
            int k = l + (r - l) / 2;

            long totalTime = 0;
            for (int p : piles) {
                totalTime += Math.ceil((double) p / k);
            }
            if (totalTime <= h) {
                res = k;
                r = k - 1;
            } else {
                l = k + 1;
            }
        }
        return res;
    }
}

// leetcode url: https://leetcode.com/problems/koko-eating-bananas/
public class p_875 {
    public static void main(String[] args) {
        int[] piles = { 3, 6, 7, 11 };
        int h = 8;
        MinEatingSpeedSolution solution = new MinEatingSpeedSolution();
        int result = solution.minEatingSpeed(piles, h);
        System.out.println("The result is: " + result);
    }
}
