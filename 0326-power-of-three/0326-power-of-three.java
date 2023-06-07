class Solution {
    public boolean isPowerOfThree(int n) {
        double a = Math.log10(n) / Math.log10(3);
        int p = (int)a;
        double c = (double)p;
        if (c == a){
            return true;
        }
        return false;
    }
}