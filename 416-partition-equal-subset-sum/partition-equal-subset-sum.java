import java.util.Arrays;

class Solution {
    private boolean solve(int[] nums, int sum, int n, int[][] dp) {
        if (sum == 0) return true;
        if (n == 0) return false;
        if (dp[n][sum] != -1) return dp[n][sum] == 1;
        if (nums[n - 1] <= sum) {
            boolean res = solve(nums, sum - nums[n - 1], n - 1, dp) || solve(nums, sum, n - 1, dp);
            dp[n][sum] = res ? 1 : 0;
            return res;
        } else {
            boolean res = solve(nums, sum, n - 1, dp);
            dp[n][sum] = res ? 1 : 0;
            return res;
        }
    }
    public boolean canPartition(int[] nums) {
        int sum = 0;
        int n = nums.length;
        for (int num : nums) {
            sum += num;
        }

        if (sum % 2 != 0) return false;

        int target = sum / 2;
        int[][] dp = new int[n + 1][target + 1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        return solve(nums, target, n, dp);
    }
}