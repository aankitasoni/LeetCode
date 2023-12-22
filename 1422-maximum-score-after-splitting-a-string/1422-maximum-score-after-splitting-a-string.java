class Solution {
    public int maxScore(String s) {
        int zero = 0, one = 0, max = Integer.MIN_VALUE;
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == '0') {
                zero++;
            } else {
                one++;
            }
            if (i != s.length()-1) {
                max = Math.max(max, zero-one);
            }
        }
        return max+one;
    }
}