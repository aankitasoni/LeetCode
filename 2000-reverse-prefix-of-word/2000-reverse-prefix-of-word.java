class Solution {
    public String reversePrefix(String word, char ch) {
        int p = word.indexOf(ch);
        if (p != -1){
            StringBuilder sb = new StringBuilder(word.substring(0, p+1));
            return sb.reverse().toString() + word.substring(p+1);
        }
        return word;
        
    }
}