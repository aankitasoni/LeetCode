class Solution {
    public int[] twoSum(int[] nums, int target) {
        int ans[] = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i =0; i < nums.length; i++){
            int value = target - nums[i];
            if (map.containsKey(value)){
                ans[0] = map.get(value);
                ans[1] = i;
            } else {
                map.put(nums[i], i);
            }
        }
        return ans;
    }
}