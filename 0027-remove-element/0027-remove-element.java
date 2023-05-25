class Solution {
    public int removeElement(int[] nums, int val) {
        List<Integer> al = new ArrayList<>();
        for (int i : nums){
            if (i == val){
                continue;
            } else {
                al.add(i);
            }
        }
        Arrays.fill(nums, 0);
        for (int i = 0; i < al.size(); i++){
            nums[i] = al.get(i);
        }
       return al.size();
    }
}
