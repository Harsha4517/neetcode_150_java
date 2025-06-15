import java.util.Arrays;

class ProductExceptSelfSolution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int[] pref = new int[n];
        int[] suff = new int[n];

        pref[0] = 1;
        suff[n - 1] = 1;
        for (int i = 1; i < n; i++) {
            pref[i] = nums[i - 1] * pref[i - 1];
        }
        for (int i = n - 2; i >= 0; i--) {
            suff[i] = nums[i + 1] * suff[i + 1];
        }
        for (int i = 0; i < n; i++) {
            res[i] = pref[i] * suff[i];
        }
        return res;
    }
}

// leetcode url: https://leetcode.com/problems/product-of-array-except-self/
public class p_238 {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4 };
        ProductExceptSelfSolution solution = new ProductExceptSelfSolution();
        int[] result = solution.productExceptSelf(nums);
        System.out.println("The result is: " + Arrays.toString(result));
    }
}
