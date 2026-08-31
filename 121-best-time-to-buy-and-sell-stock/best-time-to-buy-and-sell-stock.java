class Solution {
    public int maxProfit(int[] nums) {
        int profit = 0;
        int buy = nums[0], len = nums.length;
        for(int i = 1; i< len; i++){
            int sell = nums[i];
            if(sell > buy){
                profit = Math.max(profit, sell - buy);
            }
            else buy = sell;
        }
        return profit;
    }
}