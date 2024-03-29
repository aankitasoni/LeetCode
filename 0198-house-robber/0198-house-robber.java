class Solution {
    public int rob(int[] nums) {
        int dp[] = new int[nums.length+1];

        dp[0] = 0;
        dp[1] = nums[0];

        for(int i=2; i<dp.length; i++){
            if(dp[i-1] > dp[i-2] + nums[i-1]){
                dp[i] = dp[i-1];
            }else{
                dp[i] = nums[i-1] + dp[i-2];
            }
        }
        return dp[dp.length-1];
    }
}