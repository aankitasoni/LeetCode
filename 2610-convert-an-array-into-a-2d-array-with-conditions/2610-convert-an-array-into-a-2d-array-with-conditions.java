class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int count = 0;

        while (count != nums.length) {
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != -1 && !list.contains(nums[i])) {
                    list.add(nums[i]);
                    count++;
                    nums[i] = -1; 
                }
            }
            
            if (list.size() == 0)
                break;
            
            ans.add(list);
        }
        
        return ans;
    }
}