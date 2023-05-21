class Solution {
    public int searchInsert(int[] nums, int target) {
        List<Integer> al = new LinkedList<>();
        for(int i : nums){
            al.add(i);
        }
        if (al.contains(target)){
            return al.indexOf(target);
        } else {
            al.add(target);
            Collections.sort(al);
            return al.indexOf(target);
        }
    }
}

// Input
// [1,3,5,6]
// 2
// Output
// 4
// Expected
// 1