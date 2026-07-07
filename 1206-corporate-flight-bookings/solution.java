class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] ans=new int[n+1];
        for(int i=0;i<bookings.length;i++){
            int first=bookings[i][0]-1;
            int last=bookings[i][1];
            int seats=bookings[i][2];
            ans[first]+=seats;
            ans[last]+=-seats;
        }
        int[] res=new int[n];
        for(int i=1;i<=n;i++){
            ans[i]+=ans[i-1];
        }
        for(int i=0;i<n;i++){
            res[i]=ans[i];
        }
        return res;
    }
}
