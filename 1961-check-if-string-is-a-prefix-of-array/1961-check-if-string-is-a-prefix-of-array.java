class Solution {
    public boolean isPrefixString(String s, String[] words) {
        String p ="";
        for (int i =0; i< words.length; i++){
             p += words[i];
            if (!s.startsWith(p) || s.equals(p)){
                break;
            }
        }
        
        if (p.equals(s)) return true;
        return false;
    }
}