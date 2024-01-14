class Solution {
    public int minimumSwap(String s1, String s2) {
        int xy = 0, yx =0, res = 0;
        for (int i =0; i < s1.length(); i++){
            if (s1.charAt(i) == 'x' && s2.charAt(i) == 'y'){
                xy++;
                if (xy == 2){
                    res++;
                    xy = 0;
                }
            } else if (s2.charAt(i) == 'x' && s1.charAt(i) == 'y'){
                yx++;
                if (yx == 2){
                    res++;
                    yx = 0;
                }
            }
        }
        int p = xy + yx;
        if (p == 1) return -1;
        return res + p;
    }
}