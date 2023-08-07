class Solution {
    public boolean isPowerOfTwo(int n) {
        double a = Math.log10(n) / Math.log10(2);
        int p = (int)a;
        double c = (double)p;
        if (c == a){
            return true;
        }
        return false;
    }
}
 

// for (int i =0; i<= n ; i++){
//             if (Math.pow(2, i) == n){
//                 return true;
//             }
//         }
//         return false;