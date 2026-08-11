class Solution {
    public int[] minOperations(String boxes) {
        int n=boxes.length();
        int[] ans=new int[n];
        int movesl=0,balll=0;
        int movesr=0,ballr=0;
        for(int i=0;i<n;i++){
            ans[i]+=movesl;
            balll+=boxes.charAt(i)-'0';
            movesl+=balll;
            int j=n-1-i;
            ans[j]+=movesr;
            ballr+=boxes.charAt(j)-'0';
            movesr+=ballr;
        }
        return ans;
    }
}