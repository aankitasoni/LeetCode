class Solution {
    public boolean isPowerOfFour(int n) {
        double d = Math.log10(n) / Math.log10(4);
        int a = (int)d;
        double p = (double)a;
        if (d == p){
            return true;
        }
        return false;
    }
}
