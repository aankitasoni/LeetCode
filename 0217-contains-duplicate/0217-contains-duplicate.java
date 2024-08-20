class Solution {
    public boolean containsDuplicate(int[] nums) {
       Set<Integer> al = new HashSet<>();
        for (int i = 0; i< nums.length; i++){
            if (al.contains(nums[i])){
                return true;
            } else al.add(nums[i]);
        }
        return false;
    }
}