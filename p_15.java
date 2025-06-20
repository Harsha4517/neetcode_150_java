import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

class ThreeSumSolution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0)
                break;
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            int p = i + 1, q = nums.length - 1;
            while (p < q) {
                int sum = nums[i] + nums[p] + nums[q];
                if (sum > 0) {
                    q--;
                } else if (sum < 0) {
                    p++;
                } else {
                    res.add(Arrays.asList(nums[i], nums[p], nums[q]));
                    p++;
                    q--;
                    while (p < q && nums[p] == nums[p - 1]) {
                        p++;
                    }
                }
            }
        }
        return res;
    }
}

// leetcode url: https://leetcode.com/problems/3sum/description/
public class p_15 {
    public static void main(String[] args) {
        int[] nums = { -1, 0, 1, 2, -1, -4 };
        ThreeSumSolution solution = new ThreeSumSolution();
        List<List<Integer>> result = solution.threeSum(nums);
        System.out.println("The result is: " + result.toString());
    }
}
