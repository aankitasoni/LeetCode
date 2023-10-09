class Solution {
    public int[] searchRange(int[] nums, int target) {
        List<Integer> al = new ArrayList<>();
        for(int i : nums){
            al.add(i);
        }
        
        int p[] = new int[2];
        p[0] = al.indexOf(target);
        p[1] = al.lastIndexOf(target);
        return p;
          
        
    }
}