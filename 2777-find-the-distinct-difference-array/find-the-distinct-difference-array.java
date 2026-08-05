class Solution {
    public int[] distinctDifferenceArray(int[] nums) {
      int n=nums.length;
      int[] suffix=new int[n+1];
      HashSet<Integer> set=new HashSet<>();
      for(int i=n-1;i>=0;i--){
        set.add(nums[i]);
        suffix[i]=set.size();
      }  
      set.clear();
      int[] ans=new int[n];
      for(int i=0;i<n;i++){
        set.add(nums[i]);
        ans[i]=set.size()-suffix[i+1];
      }
      return ans;
    }
}