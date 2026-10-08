class Solution {
    public static void solve(int nums[], int idx, List<Integer> op, List<List<Integer>> res) {
        if (idx == nums.length) {
            res.add(new ArrayList<>(op));
            return;
        }
        List<Integer> op1 = new ArrayList<>(op);
        solve(nums, idx + 1, op1, res);
        List<Integer> op2 = new ArrayList<>(op);
        op2.add(nums[idx]);
        solve(nums, idx + 1, op2, res);
    }
    
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> op = new ArrayList<>();
        solve(nums, 0, op, res);
        return res;
    }
}