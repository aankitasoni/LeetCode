class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        Set<Integer> st = new HashSet<>();
        int res = 0;
        for (int i =0; i < nums.length; i++){
            if(!st.add(nums[i])){    
             res ^= nums[i];
        }
        }
        return res;
    }
}