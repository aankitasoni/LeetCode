class Solution {
    public boolean checkPowersOfThree(int n) {
         while (n>0){
             if(n % 3 == 2) return false;  // each bits in 3 = 0,1,2 == 2 can't be *3
             else n /= 3;
         }
        return true;
    }
}