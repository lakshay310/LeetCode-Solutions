class Solution {
    public int reverseBits(int n) {
        int r=0;
        for(int i=0;i<32;i++){
            int last=n&1;
            r=r<<1;
            r=r|last;
            n=n>>1;
        }
        return r;
    }
}
