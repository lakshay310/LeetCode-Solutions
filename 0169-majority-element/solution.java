class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int counter=0;
        int majority=-1;
        for(int i=0;i<n;i+=1){
            if(counter==0){
                majority=nums[i];
            }
            if(nums[i]==majority){
                counter+=1;
            }else{
                counter-=1;
            }
        }
        return majority;
    }
}
