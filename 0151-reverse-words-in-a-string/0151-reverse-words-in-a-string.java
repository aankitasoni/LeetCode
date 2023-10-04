class Solution {
    public String reverseWords(String s) {
        String ss[] = s.trim().split(" +");
        String rev = "";
        for (int i = ss.length-1; i>=0; i--){
            rev += ss[i] + " ";
        }
        return rev.trim();
    }
}
