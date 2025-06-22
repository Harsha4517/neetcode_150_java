class TwopointerSolution {
    public int trap(int[] height) {
        int l = 0, r = height.length - 1;
        int leftMax = height[l], rightMax = height[r];
        int res = 0;
        while (l < r) {
            if (leftMax < rightMax) {
                l++;
                leftMax = Math.max(leftMax, height[l]);
                res += leftMax - height[l];
            } else {
                r--;
                rightMax = Math.max(rightMax, height[r]);
                res += rightMax - height[r];
            }
        }
        return res;
    }
}

// suffix Array(calculating prefix max on the go without storing in array)
class SuffixSolution {
    public int trap(int[] height) {
        int res = 0, leftMax = height[0], n = height.length;
        int[] suffix = new int[n];
        suffix[n - 1] = height[n - 1];
        for (int i = 1; i < n; i++) {
            suffix[n - i - 1] = Math.max(suffix[n - i], height[n - i - 1]);
        }
        for (int i = 0; i < n; i++) {
            leftMax = Math.max(height[i], leftMax);
            res += Math.min(leftMax, suffix[i]) - height[i];
        }
        return res;
    }
}

// leetcode url: https://leetcode.com/problems/trapping-rain-water/
public class p_42 {
    public static void main(String[] args) {
        int[] height = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        TwopointerSolution solution = new TwopointerSolution();
        int result = solution.trap(height);
        System.out.println("The result is: " + result);
    }
}
