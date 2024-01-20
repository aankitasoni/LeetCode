class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int left = 0;
        int sum = 0;
        int rst = Integer.MAX_VALUE;
        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];
            while (sum >= s) {
                rst = Math.min(rst, right - left + 1);
                sum -= nums[left++];
            }
        }

       if( rst == Integer.MAX_VALUE) return 0;
        return rst;
    }
}