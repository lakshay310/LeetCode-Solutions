import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        if (intervals == null || intervals.length == 0) {
            return 0;
        }
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[1]));
        int c= 1; 
        int j = 0;         
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] >= intervals[j][1]) {
                c++;
                j = i;
            }
        }
        return intervals.length - c;
    }
}