class Solution {
    public int subarraySum(int[] nums, int k) {
        int n=nums.length;
        if(n==0) return 0;
        int[] prefix=new int[n];
        prefix[0]=nums[0];
        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1]+nums[i];
        }
        int c=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int currsum=prefix[j];
                if(i>0){
                    currsum-=prefix[i-1];
                }
                if(currsum==k){
                    c++;
                }
            }
        }
        return c;
    }
}