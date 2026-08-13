class Solution {
    public int[] getAverages(int[] nums, int k) {
        int n=nums.length;
        int[] avg=new int[n];
        for(int i=0;i<n;i++){
            avg[i]+=-1;
        }
        int winSize=2*k+1;
        for(int i=k;i<n-k;i++){
            long sum=0;
            for(int j=i-k;j<=i+k;j++){
                sum+=nums[j];
            }
            avg[i]=(int)(sum/winSize);
        }
        return avg;
    }
}