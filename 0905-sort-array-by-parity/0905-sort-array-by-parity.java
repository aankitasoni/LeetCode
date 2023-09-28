class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int p = 0;
        for (int i=0; i<nums.length; i++){
            if (nums[i] % 2 == 0){
               int n = nums[p];
                nums[p] = nums[i];
                nums[i] = n;
                p++;
            }
        }
        return nums;
    }
}
