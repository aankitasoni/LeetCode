class Solution {
    public int countDistinctIntegers(int[] nums) {
        Set<Integer> st = new HashSet<>();
        for (int i =0; i <nums.length; i++){
            st.add(nums[i]);
            long r = 0L;
            while(nums[i] != 0){
                r = r*10 + nums[i]%10;
                nums[i] /= 10;
            }
            if(r > Integer.MAX_VALUE || r < Integer.MIN_VALUE) return 0;
            st.add((int)r);
        }
        
        return st.size();
    }
}