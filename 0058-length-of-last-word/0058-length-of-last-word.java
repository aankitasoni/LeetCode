class Solution {
    public int lengthOfLastWord(String s) {
        String ls = s.trim();
       int i = ls.lastIndexOf(' ') +1;
        return (ls.length() - i);
        
    }
}


