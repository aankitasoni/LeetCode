
class Solution {
    public List<Boolean> kidsWithCandies(int[] c, int e) {
        int max = 0;
        for (int i = 0; i < c.length; i++){
            max = Math.max(max, c[i]);
        }
        List<Boolean> al = new ArrayList<>();
        for (int i = 0; i< c.length; i++){
            if (c[i]+e >= max){
                al.add(true);
            } else {
                al.add(false);
            }
        }
        return al;
    }
}