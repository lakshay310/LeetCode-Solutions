class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int count=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            int currsum=0;
            for(int j=i;j<n;j++){
                currsum+=nums[j];
                if(currsum==goal){
                    count++;
                }
            }
        }
        return count;
    }
}