import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

class MaxSlidingWindowSolution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] output = new int[n - k + 1];
        Deque<Integer> q = new LinkedList<>();
        int l = 0, r = 0;

        while (r < n) {
            while (!q.isEmpty() && nums[q.getLast()] < nums[r]) {
                q.removeLast();
            }
            q.addLast(r);

            if (l > q.getFirst()) {
                q.removeFirst();
            }

            if ((r + 1) >= k) {
                output[l] = nums[q.getFirst()];
                l++;
            }
            r++;
        }
        return output;
    }
}

// leetcode url: https://leetcode.com/problems/sliding-window-maximum/
public class p_239 {
    public static void main(String[] args) {
        int[] nums = { 1, 3, -1, -3, 5, 3, 6, 7 };
        int k = 3;
        MaxSlidingWindowSolution solution = new MaxSlidingWindowSolution();
        int[] result = solution.maxSlidingWindow(nums, k);
        System.out.println("The result is: " + Arrays.toString(result));
    }
}
