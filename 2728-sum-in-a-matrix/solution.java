class Solution {
    public int matrixSum(int[][] nums) {
        int r=nums.length;
        int c=nums[0].length;
        int sum=0;
        for(int i=0;i<r;i++)
        {
            Arrays.sort(nums[i]);
        }
        for(int i=0;i<c;i++)
        {  int max= nums[0][i];
            for(int j=0;j<r;j++)
            {
                if(nums[j][i]>max)
                {
                    max=nums[j][i];
                }
            }

            sum+=max;
        }

        return sum;
        
    }
}
