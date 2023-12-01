class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String ss[] = sentence.split(" ");
        for (int i = 0; i < ss.length; i++){
            String p = ss[i];
            if (p.startsWith(searchWord)){
                return i+1;
            }
        }
        return -1;
    }
}