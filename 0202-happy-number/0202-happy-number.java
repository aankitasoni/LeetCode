class Solution {
    public boolean isHappy(int n) {
        // int sum = 0;
        while(n !=1 && n != 4){
           int sum = 0;
            for (char c : String.valueOf(n).toCharArray()){
           sum += Math.pow((int)(c-'0'), 2);
           
        }
            n = sum;
        }
        
        return n == 1;
    }
}
