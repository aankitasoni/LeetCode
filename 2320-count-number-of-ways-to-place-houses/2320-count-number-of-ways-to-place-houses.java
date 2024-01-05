class Solution {
    public int countHousePlacements(int n) {
        int b = 1, s =1;
        int res = 2;
        int mod = (int)1e9 + 7;
        for (int i =1; i <=n; i++){
            res = (b+s) %mod;
            b = s;
            s = res;
        }
        return (int)(1L * s * s % mod);
    }
}