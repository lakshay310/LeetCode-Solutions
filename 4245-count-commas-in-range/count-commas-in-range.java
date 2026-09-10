class Solution {
    public int countCommas(int n) {
        int totalcommas=0;
        for(int i=1;i<=n;i++){
            if(i>=1000){
                totalcommas++;
            }
        }
        return totalcommas;
    }
}