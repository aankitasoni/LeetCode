class Solution {
    public String mergeAlternately(String word1, String word2) {
        String s = "";
        int a = word1.length();
        int b= word2.length();
        char[] w1 = word1.toCharArray();
        char[] w2 = word2.toCharArray();
        
        if (a<b){
            for (int i =0; i <a; i++){
                s += String.valueOf(w1[i]) + String.valueOf(w2[i]);
            }
            s += word2.substring(a,b);
        } else {
            for (int i =0; i <b; i++){
                s += String.valueOf(w1[i]) + String.valueOf(w2[i]);
            }
            s += word1.substring(b,a);
        }
        return s;
    }
}