class Solution {
    public int trap(int[] height) {
        int left=0, right=height.length-1;
        int maxl=0,maxr=0;
        int water=0;
        while(left<right){
            if(height[left]<height[right]){
                if(maxl<=height[left]){
                    maxl=height[left];
                }else{
                    water+=maxl-height[left];
                }
                left++;
            }
            else{
                if(maxr<=height[right]){
                    maxr=height[right];
                }else{
                    water+=maxr-height[right];
                }
                right--;
            }
        }
        return water;
    }
}
