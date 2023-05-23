class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
       List<Integer> al = new ArrayList<>();
        for(int i : nums1){
            al.add(i);
        }
        for(int j : nums2){
            al.add(j);
        }
        Collections.sort(al);
        int q = al.size();
        int p = q/2;
        if (q % 2==0){
           double sumE =  (double)(al.get(p) + al.get(p-1))/2; 
            return sumE;
        } else {
            double sumO = (double)al.get(p);
            return sumO;
        }
        // return null;
    }
}

//  // for (int i= 0; i<n ; i++){
//  //            nums1[m+i] = nums2[i];
//  //        }
//  //        Arrays.sort(nums1);
//  //        for (int j = 0; j <nums1.length; j++){
//  //            if (nums1 % 2 == 0){
//  //                double sumE = (nums1[nums1.length/2] + nums1[(nums1.length/2)+1])/2;
//  //                    // int sum1 = sum/2;
//  //                    return sumE;
//  //            } else {
//  //                double sumO = nums1[(nums1.length+1)/2];
//  //                return sumO;
//  //            }
//  //        }
//  //        return null;






// class Solution {
//     public double findMedianSortedArrays(int[] nums1, int[] nums2) {
//         List<Integer> al = new ArrayList<>();
//         for(int aa:nums1) {
//           al.add(aa);
//         }
//         for(int bb:nums2) {
//           al.add(bb);
//         }


//         Collections.sort(al);
//         int n = al.size();
//         int md = (n/2)-1;
//         double mv = 0;
//         if(n%2 == 0) {
//             mv = (double) (al.get(md) + al.get(md+1)) /2;
//         }
//         else {
//             mv = al.get(md+1);
//         }

//         return mv;
        
//     }
// }