class Solution {
    public void rotate(int[] nums, int k) {
       int n = nums.length;
        k %= n;
        int kk[] = new int[n-k];
        for (int i=0; i <n-k; i++){
            kk[i] = nums[i];
        }
        for (int i = n-k; i<n; i++){
            nums[i-n+k] = nums[i];
        }
        for (int i = 0; i<n-k; i++){
            nums[i+k] = kk[i];
        }
    }
}
