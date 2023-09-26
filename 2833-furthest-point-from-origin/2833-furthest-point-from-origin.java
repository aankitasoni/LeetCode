class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int m = 0, n =0;
        for (char c : moves.toCharArray()){
            if (c == 'L'){
                m++;
            }  else if (c == 'R'){
                m--;
            } else {
                n++;
            }
        }
        return Math.abs(m)+n;
    }
}