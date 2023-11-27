import java.math.BigInteger; 

class Solution {
    public String gcdOfStrings(String s1, String s2) {
        int n1 = s1.length();
        int n2 = s2.length();
        String s = s1+s2;
        if(!s.equals(s2+s1)){
            return "";
        }
        return s1.substring(0, gcd(n1,n2));
        
    }
    public static int gcd(int a, int b){
        if(b ==0){
            return a;
        }
        
        return gcd(b, a%b);
    }
}