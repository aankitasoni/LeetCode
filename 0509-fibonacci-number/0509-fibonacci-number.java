class Solution {
    public int fib(int n) {
         
        if (n <= 1){
           return n;  
        }
        int p = 0, pp=1, ans  = 0;
        for (int i =2; i<= n; i++){
                ans = p + pp;
                p =pp;
                pp = ans;
            }
            return ans;
    }
}

