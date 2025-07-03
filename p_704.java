class SearchSolution {
    public int search(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}

// leetcode url: https://leetcode.com/problems/binary-search/
public class p_704 {
    public static void main(String[] args) {
        int[] nums = { -1, 0, 3, 5, 9, 12 };
        int target = 9;
        SearchSolution solution = new SearchSolution();
        int result = solution.search(nums, target);
        System.out.println("The result is: " + result);
    }
}
