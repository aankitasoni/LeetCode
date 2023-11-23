class Solution {
    public int findFinalValue(int[] nums, int o) {
        for(int i =0; i<nums.length; i++){
            if(nums[i] == o){
                o = 2*o;
            } else{
                for(int j = 0; j< nums.length; j++){
                    if (nums[j] == o){
                        o = 2*o;
                    }
                }
            }
        }
        return o;
    }
}