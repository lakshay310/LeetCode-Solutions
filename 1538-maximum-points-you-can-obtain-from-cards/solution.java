class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n=cardPoints.length;
        int sum=0;
        for(int i=0;i<k;i++)
        sum+=cardPoints[i];
        int max=sum;
        int r=n-1;
        for(int l=k-1;l>=0;l--){
            sum-=cardPoints[l];
            sum+=cardPoints[r];
            r--;
            max=Math.max(max,sum);
        }
        return max;
    }
}
