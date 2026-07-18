class Solution {
    public int firstOccurence(int [] nums, int target){
        int st =0, end = nums.length-1;
        int ans = -1;
        while(st <= end){
            int mid = st+(end - st)/2;
            if(nums[mid] == target){
                ans = mid;
                end = mid-1;
            } 
            else if(nums[mid] < target){
                 st = mid+1;
            }
            else if(nums[mid] > target) end = mid-1;
        }
        return ans;
    }

    public int lastOccurence(int [] nums, int target){
        int st =0, end = nums.length-1;
        int ans = -1;
        while(st <= end){
            int mid = st+(end - st)/2;
            if(nums[mid] == target){
                ans = mid;
                st = mid+1;
            } 
            else if(nums[mid] < target){
                 st = mid+1;
            }
            else if(nums[mid] > target) end = mid-1;
        }
        return ans;
    }
    public int[] searchRange(int[] nums, int target) {
        return new int[]{firstOccurence(nums,target), lastOccurence(nums, target)};
    }
}
