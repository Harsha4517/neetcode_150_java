import java.util.HashMap;
import java.util.Arrays;

class TwoSumSolution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> twoSumMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int diff = target - num;
            if (twoSumMap.containsKey(diff)) {
                return new int[] { twoSumMap.get(diff), i };
            }
            twoSumMap.put(num, i);
        }

        return new int[] {};
    }
}

// leetcode url: https://leetcode.com/problems/two-sum/
public class p_1 {
    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;
        TwoSumSolution solution = new TwoSumSolution();
        int[] result = solution.twoSum(nums, target);
        System.out.println("The result is: " + Arrays.toString(result));
    }
}
