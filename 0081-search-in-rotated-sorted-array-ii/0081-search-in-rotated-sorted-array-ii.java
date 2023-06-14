class Solution {
    public boolean search(int[] nums, int target) {
        List<Integer> al = new ArrayList<>();
        for (int i : nums){
            al.add(i);
        }
        for (int i = 0; i < al.size(); i++){
            if (al.contains(target)){
                return true;
            }
        }
        return false;
    }
}