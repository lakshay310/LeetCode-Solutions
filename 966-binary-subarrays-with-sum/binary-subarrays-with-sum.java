class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int count=0;
        int psum=0;
        int[] pcount=new int[nums.length+1];
        pcount[0]=1;
        for(int num:nums){
            psum+=num;
            if(psum>=goal){
                count+=pcount[psum-goal];
            }
            pcount[psum]++;
        }
        return count;
    }
}