class Solution {
    public boolean canBeEqual(String s1, String s2) {
     // 4 -- size given
        for (int i = 0; i < 4; i++){
            if (s1.charAt(i) != s2.charAt(i) && (s1.charAt(i) != s2.charAt((i+2) % 4))) return false;
        }
        return true;
    }
}