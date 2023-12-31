class Solution {
    public boolean findSubarrays(int[] nums) {
        Set<Integer> st = new HashSet<>();
        
        for (int i =1; i <nums.length; i++){
            int n = nums[i-1]+nums[i];
            if (!st.add(n)){
                return true;
            }
        }
        return false;
    }
}