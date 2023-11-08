class Solution {
    public String largestGoodInteger(String s) {
        int ans = -1;
        String res = "";
        for (int i = 0; i <s.length()-2; i++){
            if(s.charAt(i) == s.charAt(i+1) && s.charAt(i+1) == s.charAt(i+2)){
                ans = Math.max(ans, s.charAt(i)-'0'); 
            }
        }
        if (ans != -1){
            res = String.valueOf(ans) + String.valueOf(ans) + String.valueOf(ans);
            // return res;
        }
         
        return res;
    }
}