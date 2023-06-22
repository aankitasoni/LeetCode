class Solution {
    public int lengthOfLastWord(String s) {
        String ls = s.trim();
        int count = 0;
        for (int i = ls.length()-1 ; i >= 0; i--){
            if (ls.charAt(i) == ' '){
                break;
            } else {
                count++;
            }
        }
        return count;
        
        
    }
}
