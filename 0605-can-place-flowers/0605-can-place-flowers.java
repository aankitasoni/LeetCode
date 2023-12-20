class Solution {
    public boolean canPlaceFlowers(int[] f, int n) {
        int count = 1, ans = 0;
        for (int i =0; i <f.length; i++){
            if (f[i] == 0){
                count++;
            } else {
                ans += (count-1)/2;
                count = 0;
            }
        }
        if (count != 0) {
            ans += count/2;
        }
        return ans>= n;
    }
}

