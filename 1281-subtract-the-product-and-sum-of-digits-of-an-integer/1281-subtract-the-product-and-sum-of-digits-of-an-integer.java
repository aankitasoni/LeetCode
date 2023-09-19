class Solution {
    public int subtractProductAndSum(int n) {
        int sum =0;
        int mul = 1;
        String s = String.valueOf(n);
        for (int i =1;i<= s.length(); i++){
            int p = Integer.parseInt(String.valueOf(s.charAt(i-1)));
            sum += p;
            mul *= p;
        }
       
        int r = mul-sum;
        return r;
        
    }
}