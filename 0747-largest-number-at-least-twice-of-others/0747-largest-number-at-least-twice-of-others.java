class Solution {
    public int dominantIndex(int[] nums) {
        int lar = -1;
        int seclar = -1;
        int ans = -1;
        for(int i =0; i<nums.length; i++){
            if(nums[i] > lar){
                seclar = lar;
                lar = nums[i];
                ans = i;
            } else if(nums[i]>seclar){
                seclar = nums[i];
            }
        }
        if(lar >= 2*seclar ){
            return ans;
        }
        return -1;
    }
}