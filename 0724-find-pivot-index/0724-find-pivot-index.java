class Solution {
    public int pivotIndex(int[] nums) {
        int t =0, l =0;
        for (int i : nums){
            t += i;
        }
        for (int i =0; i<nums.length;l += nums[i++]){
            
            if (2*l == t - nums[i]){
            return i;
        }
        }
       
        return -1;
    }
}

// int pivot = 0;
//         while (pivot < nums.length){
//             int l = 0, r =0;
//             for (int i =0; i<pivot; i++){
//                 l += nums[i];
//             }
//             for (int i = pivot+1; i<nums.length; i++){
//                 r += nums[i];
//             }
//             if (l == r){
//                 return pivot;
//             } else {
//                 pivot++;
//             }
//         }
//         return -1;

           