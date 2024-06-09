class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int[] sums = new int[k]; // array to keep track of the counts of prefix sums modulo k
        sums[0]++; // one prefix sum always initially 0
        
        int cnt = 0;
        int currSum = 0;
        
        for (int i = 0; i < nums.length; i++) {
            // Update current prefix sum with current element, handle negative values correctly
            currSum = (currSum + nums[i] % k + k) % k;
            cnt += sums[currSum]; // Add current prefix sum mod k has seen before to the count
            sums[currSum]++; // Increment the count for this prefix sum modulo k
        }
        
        return cnt;
    }
}