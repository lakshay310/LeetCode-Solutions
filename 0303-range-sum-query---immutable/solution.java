class NumArray {
    private int[] prefix;
    private int[] suffix;
    private int total;

    public NumArray(int[] nums) {
        int n=nums.length;
        if(n==0) return;
        prefix=new int[n];
        suffix=new int[n];
        prefix[0]=nums[0];
        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1]+nums[i];
        }
        total=prefix[n-1];
        suffix[n-1]=nums[n-1];
        for(int i=n-2;i>=0;i--){
            suffix[i]=suffix[i+1]+nums[i];
        }
        
    }
    
    public int sumRange(int left, int right) {
        int leftexc=0;
        int rightexc=0;
        if(left>0){
            leftexc=prefix[left-1];
        }
        if(right<suffix.length-1){
            rightexc=suffix[right+1];
        }
        return total-leftexc-rightexc;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */
