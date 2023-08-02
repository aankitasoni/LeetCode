class Solution {
    public int[] getConcatenation(int[] nums) {
        List<Integer> al = new ArrayList<>();
        for (int i : nums){
            al.add(i);
        }
        for (int i : nums){
            al.add(i);
        }
       
        int a[] = new int[al.size()];
        for(int i =0; i< al.size(); i++){
            a[i] = al.get(i);
        }
        return a;
    }
}