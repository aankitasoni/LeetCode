class Solution {
    public void moveZeroes(int[] nums) {
        int j = 0;
       for (int i = 0; i < nums.length; i++){
           if (nums[i] != 0){
               nums[j] = nums[i];
               j++;
           } 
       }
        for (int i = j; i < nums.length; i++){
            nums[i] = 0;
        }
    }
}


 // ArrayList<Integer> al = new ArrayList<>();
 //        for (int i : nums){
 //            if (i != 0 ){
 //                al.add(i);
 //            } 
 //        }
 //        Arrays.fill(nums, 0);
 //        for (int i =0 ; i < al.size(); i++){
 //            nums[i] = al.get(i);
 //        }