class Solution {
    public void moveZeroes(int[] nums) {
        int j= -1;
        for (int i = 0; i< nums.length; i++){
            if (nums[i] == 0){
                j = i;
                break;
            }
        }
        if (j == -1) {
            return;
        }
        
        for (int i=j+1; i <nums.length; i++){
            if (nums[i] != 0){
                int p = nums[i];
                nums[i] = nums[j];
                nums[j] = p;
                j++;
            }
        }
        return;
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