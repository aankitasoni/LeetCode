class Solution {
    public boolean isPalindrome(String s) {
        String ss = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        boolean bl = true;
        for (int i=0; i<ss.length(); i++){
            if (ss.charAt(i) == ss.charAt(ss.length()-1-i)){
                continue;
            } else {
                bl = false;
            }
        }
        if (bl == true){
            return true;
        } else {
            return false;
        }
    }
}