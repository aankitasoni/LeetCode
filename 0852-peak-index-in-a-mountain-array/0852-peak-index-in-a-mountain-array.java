class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        List<Integer> al = new ArrayList<>();
        for (int i : arr){
            al.add(i);
        }
        return al.indexOf(Collections.max(al));
    }
}