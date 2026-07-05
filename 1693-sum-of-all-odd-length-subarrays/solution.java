class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int total=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            int leftside=i+1;
            int rightside=n-i;
            int totalsubarray=leftside*rightside;
            int oddsubarray=(totalsubarray+1)/2;
            total+=oddsubarray*arr[i];
        }
        return total;
        
        
    }
}
