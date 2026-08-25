class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        int tTime=0;
        int hasM=0, hasP=0, hasG=0;
        for(int i=0;i<garbage.length;i++){
            tTime+=garbage[i].length();
            if(garbage[i].indexOf('M')!=-1) hasM=i;
            if(garbage[i].indexOf('P')!=-1) hasP=i;
            if(garbage[i].indexOf('G')!=-1) hasG=i;
        }
        int currTtime=0;
        for(int i=0;i<travel.length;i++){
            currTtime+=travel[i];
            if(i+1==hasM) tTime+=currTtime;
            if(i+1==hasP) tTime+=currTtime;
            if(i+1==hasG) tTime+=currTtime;
        }
        return tTime;
    }
}