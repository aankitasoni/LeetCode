class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();
        for (int i : nums1){
            s1.add(i);
        }
        for (int i : nums2){
            s2.add(i);
        }
        
        s1.retainAll(s2);            // remove all elements from s1 that is not present in s2
        
        int a[] = new int[s1.size()];
        
        int p =0;
        for (int i :s1){
            a[p++] = i;
        }
        return a;
    }
}
