import java.util.Arrays;

class TwoSum2Solution {
    public int[] twoSum2(int[] numbers, int target) {
        int p = 0, q = numbers.length - 1;
        while (p < q) {
            int currSum = numbers[p] + numbers[q];
            if (currSum == target) {
                return new int[] { p + 1, q + 1 };
            } else if (currSum > target) {
                q -= 1;
            } else {
                p += 1;
            }
        }
        return new int[0];
    }
}

// leetcode url: https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
public class p_167 {
    public static void main(String[] args) {
        int[] numbers = { 2, 7, 11, 15 };
        int target = 9;
        TwoSum2Solution solution = new TwoSum2Solution();
        int[] result = solution.twoSum2(numbers, target);
        System.out.println("The result is: " + Arrays.toString(result));
    }
}
