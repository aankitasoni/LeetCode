class Solution {
    public int maxAscendingSum(int[] nums) {
        int p  = nums[0], ans =nums[0];
      for (int i = 1; i < nums.length; i++){
         if (nums[i] > nums[i-1]){
             p += nums[i];
         } else {
             p = nums[i];
         }
          ans = Math.max(ans, p);
      }   
        return ans;
    }
}