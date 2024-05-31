class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        Set<Integer> st = new HashSet<>();
        Set<Integer> ans = new HashSet<>();
        for (int i =0; i < nums.length; i++){
            if(!st.contains(nums[i])){
                st.add(nums[i]);
            }else{
                ans.add(nums[i]);
            }
        }
        st.clear();
        int res = 0;
        for (int i : ans){
            res ^= i;
        }
        return res;
    }
}