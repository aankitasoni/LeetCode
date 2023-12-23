class Solution {
    public boolean strongPasswordCheckerII(String s) {
        if (s.length() < 8) return false;
        for (int i = 1; i < s.length(); i++){
            if (s.charAt(i-1) == s.charAt(i)) return false;
        }
       
        return (s.matches(".*[a-z].*") && s.matches(".*[A-Z].*") && s.matches(".*\\d.*") && s.matches(".*[-!@#$%^&*()+].*"));
    }
}