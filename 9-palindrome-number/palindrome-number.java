class Solution {
    public boolean isPalindrome(int x) {
        if(x<0||(x%10==0&&x!=0)) return false;
        int reverseHalf=0;
        while(x>reverseHalf){
            int d=x%10;
            reverseHalf=reverseHalf*10+d;
            x/=10;
        }
        return x==reverseHalf||x==reverseHalf/10;
    }
}