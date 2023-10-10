class Solution {
    public int removeDuplicates(int[] nums) {
        int count = 0;
		for (int i =1; i<nums.length; i++){
			if(nums[count] != nums[i]){
                nums[count +1] = nums[i];
                count++;
            }
		}
		return count+1;
    }
}




//         ArrayList<Integer> al = new ArrayList<>();
//         for (int i =0; i < nums.length; i++){
//             if (al.contains(nums[i])){
//                 continue;
//             } else {
//                 al.add(nums[i]);
//             }
//         }
//         Arrays.fill(nums, -101);
//         for (int i =0; i < al.size() ; i++){
//             nums[i] = al.get(i);
//         }
        
//         return al.size();
