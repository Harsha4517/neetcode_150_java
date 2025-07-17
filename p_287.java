class FindDuplicateSolution {
    public int findDuplicate(int[] nums) {
        int slow = 0, fast = 0;
        while (true) {
            slow = nums[slow];
            fast = nums[nums[fast]];
            if (slow == fast) {
                break;
            }
        }

        int slow2 = 0;
        while (true) {
            slow = nums[slow];
            slow2 = nums[slow2];
            if (slow == slow2) {
                return slow;
            }
        }
    }
}

// leetcode url: https://leetcode.com/problems/find-the-duplicate-number/
public class p_287 {
    public static void main(String[] args) {
        int[] nums = { 1, 3, 4, 2, 2 };
        FindDuplicateSolution solution = new FindDuplicateSolution();
        int result = solution.findDuplicate(nums);
        System.out.println("The result is: " + result);
    }
}
