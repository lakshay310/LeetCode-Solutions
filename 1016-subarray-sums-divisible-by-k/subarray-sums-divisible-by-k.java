class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int[] remcount=new int[k];
        remcount[0]=1;
        int count=0;
        int ps=0;
        for(int num:nums){
            ps+=num;
            int rem=(ps%k+k)%k;
            count+=remcount[rem];
            remcount[rem]++;
        }
        return count;
        
    }
}