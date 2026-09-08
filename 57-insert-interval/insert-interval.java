class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int n=intervals.length;
        int[][] comb=new int[n+1][2];
        for(int i=0;i<n;i++){
            comb[i]=intervals[i];
        }
        comb[n]=newInterval;
        Arrays.sort(comb,Comparator.comparingInt(a->a[0]));
        List<int[]> merged=new ArrayList<>();
        int[] curr=comb[0];
        merged.add(curr);
        for(int i=1;i<comb.length;i++){
            if(curr[1]>=comb[i][0]){
                curr[1]=Math.max(curr[1],comb[i][1]);
            }else{
                curr=comb[i];
                merged.add(curr);
            }
        }
        return merged.toArray(new int[merged.size()][]);
    }
}