class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        int arr[] = new int[n];
        for (int i =0; i <n; i++){
            if (nums[i] > 0 && nums[i] <= n){
                arr[nums[i]-1] = nums[i];
            }
        }
        for (int i = 0; i < n; i++){
            if (arr[i] != i+1){
               return i+1;
            }
        }
        return n+1;
    }
}

