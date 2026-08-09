class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        mp.put(0,-1);
        int run=0;
        for(int i=0;i<nums.length;i++){
            run+=nums[i];
            int rem=run%k;
            if(mp.containsKey(rem)){
                if(i-mp.get(rem)>=2){
                    return true;
                }
            }else{
                mp.put(rem,i);
            }
        }
        return false;
    }
}