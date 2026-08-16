class Solution {
    public int characterReplacement(String s, int k) {
        int[] c=new int[26];
        int l=0;
        int maxlen=0;
        int maxfreq=0;
        for(int r=0;r<s.length();r++){
            char curr=s.charAt(r);
            c[curr-'A']++;
            maxfreq=Math.max(maxfreq,c[curr-'A']);
            while((r-l+1)-maxfreq>k){
                char lchar=s.charAt(l);
                c[lchar-'A']--;
                l++;
            }
            maxlen=Math.max(maxlen,r-l+1);
        }
        return maxlen;
    }
}