class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        Map<Integer,Integer> mp=new HashMap<>();
        int left=0;
        int ans=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
            while(mp.get(nums[i])>k){
                mp.put(nums[left],mp.get(nums[left])-1);
                left++;
            }
            ans=Math.max(ans,i-left+1);
        }
        return ans;

    }
}