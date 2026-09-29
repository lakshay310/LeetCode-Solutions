class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int[] sums=new int[1];
        sums[0]=0;
        for(int num:nums){
            int[] newSums=new int[sums.length*2];
            for(int i=0;i<sums.length;i++){
                newSums[2*i]=sums[i]+num;
                newSums[2*i+1]=sums[i]-num;
            }
            sums=newSums;
        }
        int count=0;
        for(int sum:sums){
            if(sum==target){
                count++;
            }
        }
        return count;
    }
}