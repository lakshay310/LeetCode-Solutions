class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> res=new ArrayList<>();
        int n=nums.length;
        int thres=n/3;
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            if(count>thres&&!res.contains(nums[i])){
                res.add(nums[i]);
            }
        }
        return res;
    }
}