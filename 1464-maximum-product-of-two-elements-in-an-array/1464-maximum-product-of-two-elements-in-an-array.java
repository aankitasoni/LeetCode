class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int p = 0;
        for(int i = nums.length-1; i >=0; i--){
            p = (nums[nums.length-1]-1)*(nums[nums.length-2]-1);
        }
        return p;
    }
}
