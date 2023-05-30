class Solution {
    public int[] searchRange(int[] nums, int target) {
        int a = -1, b = -1;
        for (int i = 0 ; i < nums.length ; i++){
            if(nums[i] == target){
                a=i;
                break;
            }
        }
        for (int i=nums.length-1; i>=0; i--){
            if(nums[i] == target){
                b = i;
                break;
            }
        }
        int p[] = new int[2];
        for (int i =0; i<1; i++){
            p[i] = a;
            p[i+1] = b;
        }
        return p;
    }
}