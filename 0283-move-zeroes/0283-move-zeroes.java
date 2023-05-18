class Solution {
    public void moveZeroes(int[] nums) {
        ArrayList<Integer> al = new ArrayList<>();
        for (int i : nums){
            if (i != 0 ){
                al.add(i);
            } 
        }
        Arrays.fill(nums, 0);
        for (int i =0 ; i < al.size(); i++){
            nums[i] = al.get(i);
        }
    }
}