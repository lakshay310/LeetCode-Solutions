class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int[] diff=new int[1001];
        for(int[] trip:trips){
            int pass=trip[0];
            int from=trip[1];
            int to=trip[2];
            diff[from]+=pass;
            diff[to]-=pass;
        }
        int currpass=0;
        for(int i=0;i<=1000;i++){
            currpass+=diff[i];
            if(currpass>capacity){
                return false;
            }
        }
        return true;
    }
}
