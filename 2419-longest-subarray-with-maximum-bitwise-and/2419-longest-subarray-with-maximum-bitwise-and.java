class Solution {
    public int longestSubarray(int[] nums) {
        int max = 0;
        for (int i =0; i< nums.length; i++){
            max = Math.max(max, nums[i]);
        }
        int count = 1;
        int max_length = 1;
        for (int i =0; i < nums.length-1; i++){
            if (max == nums[i] && nums[i] == nums[i+1]){
                count++;
            } else {
                count = 1;
            }
            max_length = Math.max(max_length, count);
        }
        
        return max_length;
    }
}