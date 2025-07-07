class SortedRotatedSearchSolution {
    public int search(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        while (l <= r) {
            int mid = l + ((r - l) / 2);

            if (nums[mid] == target) {
                return mid;
            }

            if (nums[l] <= nums[mid]) {
                if (target > nums[mid] || target < nums[l]) {
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
            } else {
                if (target < nums[mid] || target > nums[r]) {
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            }

        }

        return -1;
    }
}

// leetcode url: https://leetcode.com/problems/search-in-rotated-sorted-array/
public class p_33 {
    public static void main(String[] args) {
        int[] nums = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 0;
        SortedRotatedSearchSolution solution = new SortedRotatedSearchSolution();
        int result = solution.search(nums, target);
        System.out.println("The result is: " + result);
    }
}
