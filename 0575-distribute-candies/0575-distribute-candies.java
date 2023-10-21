class Solution {
    public int distributeCandies(int[] c) {
        int n = c.length/2;
        Set<Integer> st = new HashSet<>();
        for (int i :c ){
            st.add(i);
        }
        return Math.min(st.size(), n);
    }
}