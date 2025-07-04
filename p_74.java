class SearchMatrixSolution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int ROWS = matrix.length, COLS = matrix[0].length;

        int l = 0, r = ROWS * COLS - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            int row = m / COLS, col = m % COLS;
            if (target > matrix[row][col]) {
                l = m + 1;
            } else if (target < matrix[row][col]) {
                r = m - 1;
            } else {
                return true;
            }
        }
        return false;
    }
}

// leetcode url: https://leetcode.com/problems/search-a-2d-matrix/
public class p_74 {
    public static void main(String[] args) {
        int[][] nums = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } };
        int target = 10;
        SearchMatrixSolution solution = new SearchMatrixSolution();
        boolean result = solution.searchMatrix(nums, target);
        System.out.println("The result is: " + result);
    }
}
