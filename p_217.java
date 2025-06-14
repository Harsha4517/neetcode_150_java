import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (seen.contains(num)) {
                return true;
            }
            seen.add(num);
        }
        return false;
    }
}

// leetcode url: https://leetcode.com/problems/contains-duplicate/
public class p_217 {
    public static void main(String[] args) {
        int[] input = { 1, 2, 3, 1 };
        Solution solution = new Solution();
        Boolean result = solution.containsDuplicate(input);
        System.out.println("The result is: " + result);
    }
}
