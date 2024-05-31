class Solution {
    public int[] singleNumber(int[] nums) {
        Set<Integer> al = new HashSet<>();
        for (int i =0; i < nums.length; i++){
            if (!al.contains(nums[i])){
                al.add(nums[i]);
            } else{
                al.remove(nums[i]);
            }
        }
        int ans[] = new int[2];
        int p = 0;
        for (int i : al){
            ans[p++] = i;
        }
        return ans;
    }
}