class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int ans=n*(n+1)/2;
        int act_ans=0;
        for(int i=0;i<n;i++){
            act_ans+=nums[i];
        }
        return ans-act_ans;
    }
}
