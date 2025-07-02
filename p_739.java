import java.util.Arrays;

//dp solution
class DailyTemperaturesSolution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] res = new int[n];

        for (int i = n - 2; i >= 0; i--) {
            int j = i + 1;
            while (j < n && temperatures[j] <= temperatures[i]) {
                if (res[j] == 0) {
                    j = n;
                    break;
                }
                j += res[j];
            }

            if (j < n) {
                res[i] = j - i;
            }
        }
        return res;
    }
}

// leetcode url: https://leetcode.com/problems/daily-temperatures/
public class p_739 {
    public static void main(String[] args) {
        int[] temperatures = { 73, 74, 75, 71, 69, 72, 76, 73 };
        DailyTemperaturesSolution solution = new DailyTemperaturesSolution();
        int[] result = solution.dailyTemperatures(temperatures);
        System.out.println("The result is: " + Arrays.toString(result));
    }
}
