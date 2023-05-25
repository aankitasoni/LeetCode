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
        // for (int i = 0; i < al.size(); i++){
        //     if (al.get(i) == val){
        //         al.remove(i);
        //     }
        //     return al.size();
        // }
        
        return al.size();
    }
}


// List<Integer> al = new ArrayList<>();
//         for (int i : nums){
//             al.add(i);
//         }
//         for (int i = 0; i < al.size(); i++){
//             int count = 0;
//             if (al.contains(val)){
//                 al.remove(val);
//                 count ++;
//                 return count;
//             }
            
//         }
//         return al.size();