class Solution {
    public int largestAltitude(int[] gain) {
        int n=gain.length;
        int highestalt=0;
        int currentalt=0;
        for(int i=0;i<n;i++){
            currentalt+=gain[i];
            if(currentalt>highestalt){
                highestalt=currentalt;
            }
        }
        return highestalt;
    }
}
