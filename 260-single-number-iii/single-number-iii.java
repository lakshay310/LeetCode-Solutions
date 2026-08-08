class Solution {
    public int[] singleNumber(int[] nums) {
        int[] res=new int[2];
        int n=nums.length;
        int index=0;
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            if(count==1){
                res[index++]=nums[i];
            }
        }
        return res;
    }
}