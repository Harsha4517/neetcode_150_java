import java.util.Set;
import java.util.HashSet;

class LongestConsecutiveSolution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }
        int longest = 0;
        for (int num : numSet) {
            if (!numSet.contains(num - 1)) {
                int length = 1;
                while (numSet.contains(num + length)) {
                    length++;
                }
                longest = Math.max(longest, length);
            }
        }
        return longest;
    }
}

// leetcode url: https://leetcode.com/problems/longest-consecutive-sequence/
public class p_128 {
    public static void main(String[] args) {
        int[] nums = { 100, 4, 200, 1, 3, 2 };
        LongestConsecutiveSolution solution = new LongestConsecutiveSolution();
        int result = solution.longestConsecutive(nums);
        System.out.println("The result is: " + result);
    }
}
