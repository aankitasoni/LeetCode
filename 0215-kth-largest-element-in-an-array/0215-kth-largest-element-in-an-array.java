class Solution {
    public int findKthLargest(int[] nums, int k) {
        List<Integer> al = new ArrayList<>();
        for (int i: nums){
            al.add(i);
        }
        Collections.sort(al, Comparator.reverseOrder());
        return al.get(k-1);
    }
}