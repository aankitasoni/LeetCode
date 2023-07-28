class Solution {
    public int[] shuffle(int[] nums, int n) {
        int x[] = new int[n];
        int y[] = new int[n];
        for (int i =0; i<n; i++){
            x[i] = nums[i];
        }
        for (int i =0; i<n; i++){
            y[i] = nums[i+n];
        }
        List<Integer> al = new ArrayList<>();
        for (int i=0; i < n; i++){
            al.add(x[i]) ;
            al.add(y[i]);
        }
        
        for (int i =0; i< al.size(); i++){
            nums[i] = al.get(i);
        }
        return nums;
    
    }
}