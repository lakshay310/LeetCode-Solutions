class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n=nums.length;
        int minlen=Integer.MAX_VALUE;
        int l=0;
        int currsum=0;
        for(int r=0;r<n;r++){
            currsum+=nums[r];
            while(currsum>=target){
                minlen=Math.min(minlen,r-l+1);
                currsum-=nums[l];
                l++;
            }
        }
        if(minlen==Integer.MAX_VALUE){
            return 0;
        }else{
            return minlen;
        }
    }
}