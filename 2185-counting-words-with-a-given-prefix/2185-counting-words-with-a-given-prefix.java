class Solution {
    public int prefixCount(String[] words, String pref) {
        int count = 0;
        for (int i =0; i<words.length; i++){
            String p = words[i];
            if (p.startsWith(pref)){
                count++;
            }
        }
        return count;
    }
}