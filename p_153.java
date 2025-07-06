class FindMinSolution {
    public int findMin(int[] nums) {
        int l = 0;
        int r = nums.length - 1;

        while (l < r) {
            int m = l + (r - l) / 2;
            if (nums[m] < nums[r]) {
                r = m;
            } else {
                l = m + 1;
            }
        }
        return nums[l];
    }
}

// leetcode url:
// https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
public class p_153 {
    public static void main(String[] args) {
        int[] nums = { 3, 4, 5, 1, 2 };
        FindMinSolution solution = new FindMinSolution();
        int result = solution.findMin(nums);
        System.out.println("The result is: " + result);
    }
}
