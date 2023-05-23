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
    }
}
