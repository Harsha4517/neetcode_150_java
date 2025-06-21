class MaxAreaSolution {
    public int maxArea(int[] height) {
        int res = 0, l = 0, r = height.length - 1;
        while (l < r) {
            res = Math.max(res, Math.min(height[l], height[r]) * (r - l));
            if (height[l] > height[r]) {
                r--;
            } else {
                l++;
            }
        }
        return res;
    }
}

// leetcode url: https://leetcode.com/problems/container-with-most-water
public class p_11 {
    public static void main(String[] args) {
        int[] nums = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        MaxAreaSolution solution = new MaxAreaSolution();
        int result = solution.maxArea(nums);
        System.out.println("The result is: " + result);
    }
}
