class Solution {
    public int findMin(int[] nums) {
        int n=nums.length;
       int st=0;
       int end=n-1;
       while(st<=end){
       if(nums[st]<=nums[end]) return nums[st];
       int mid=st+(end-st)/2;
       int prev=(mid-1+n)%n;
       int next=(mid+1)%n;
       if(nums[mid]<=nums[prev]&&nums[mid]<=nums[next]) return nums[mid];
       if(nums[st]<=nums[mid]) st=mid+1;
       else end=mid-1;
        
    }
    return -1;
    }
}
