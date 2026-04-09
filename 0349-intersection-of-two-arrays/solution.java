class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet <Integer> set=new HashSet<>();
        HashSet <Integer> res=new HashSet<>();
        for(int i=0;i<nums1.length;i++ ){
            set.add(nums1[i]);
        }
        for(int j=0;j<nums2.length;j++){
            if(set.contains(nums2[j])){
                res.add(nums2[j]);
            }
        }
        int[] ans=new int[res.size()];
        int l=0;
        for(int val:res){
           ans[l++]=val;
        }
        return ans;
    }
}
