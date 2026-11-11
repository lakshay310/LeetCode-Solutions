class Solution {
    public int deleteAndEarn(int[] nums) {
        if(nums==null||nums.length==0) return 0;
        int max=0;
        for(int num:nums){
            max=Math.max(max,num);
        }
        int[]sum=new int[max+1];
        for(int num:nums){
            sum[num]+=num;
        }
        int r1=0;
        int r2=0;
        for(int val:sum){
            int curr=Math.max(r2,r1+val);
            r1=r2;
            r2=curr;
        }
        return r2;
    }
}