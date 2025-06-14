import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class TopKFrequentSolution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        List<Integer>[] freq = new List[nums.length + 1];

        for (int i = 0; i < freq.length; i++) {
            freq[i] = new ArrayList<>();
        }

        for (int n : nums) {
            count.put(n, count.getOrDefault(n, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            freq[entry.getValue()].add(entry.getKey());
        }

        int[] res = new int[k];
        int index = 0;
        for (int i = freq.length - 1; i > 0; i--) {
            for (int n : freq[i]) {
                res[index++] = n;
                if (index == k) {
                    return res;
                }
            }
        }
        return res;
    }
}

// leetcode url: https://leetcode.com/problems/top-k-frequent-elements/
public class p_347 {
    public static void main(String[] args) {
        int[] nums = { 1, 1, 1, 2, 2, 3 };
        int k = 2;
        TopKFrequentSolution solution = new TopKFrequentSolution();
        int[] result = solution.topKFrequent(nums, k);
        System.out.println("The result is: " + Arrays.toString(result));
    }
}
