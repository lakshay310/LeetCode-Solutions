class Solution {
    public int solve(int[] arr, int idx, int target, int totalsum, int[][] dp) {
        if (idx == arr.length) return target == 0 ? 1 : 0;
        int sum = target + totalsum;
        if (sum < 0 || sum >= dp[0].length) return 0;
        
        if (dp[idx][sum] != -1) {
            return dp[idx][sum];
        }
        
        int add = solve(arr, idx + 1, target + arr[idx], totalsum, dp);
        int sub = solve(arr, idx + 1, target - arr[idx], totalsum, dp);
        
        return dp[idx][sum] = add + sub;
    }
    
    public int findTargetSumWays(int[] arr, int target) {
        int totalsum = 0;
        for (int num : arr) {
            totalsum += num;
        }
        if (Math.abs(target) > totalsum) return 0;
        
        int idx = 0;
        int[][] dp = new int[arr.length + 1][2 * totalsum + 1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return solve(arr, idx, target, totalsum, dp);
    }
}