class Solution {
    public int search(int[] nums, int target) {
        //  ArrayList<Integer> al = new ArrayList<>();
        // for (int i : nums){
        //     al.add(i);
        //     }
        //  if (al.contains(target)){
        //         return al.indexOf(target);
        //     } else {
        //         return -1;
        // }
        for (int i = 0; i <nums.length; i++){
            if (nums[i] == target){
                return i;
            }
        }
        return -1;
    }
}

