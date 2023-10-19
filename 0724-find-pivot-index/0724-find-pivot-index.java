class Solution {
    public int pivotIndex(int[] nums) {
        int pivot = 0;
        while (pivot < nums.length){
            int l = 0, r =0;
            for (int i =0; i<pivot; i++){
                l += nums[i];
            }
            for (int i = pivot+1; i<nums.length; i++){
                r += nums[i];
            }
            if (l == r){
                return pivot;
            } else {
                pivot++;
            }
        }
        return -1;
    }
}

           