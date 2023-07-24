class Solution {
    public String reversePrefix(String word, char ch) {
        // char[] a = word.tocharArray();
        String a = "";
        if (word.contains(String.valueOf(ch))){
            int p = word.indexOf(ch);
            for (int i= p; i>= 0; i-- ){
                a += String.valueOf(word.charAt(i));
            }
            a += word.substring(p+1);
            return a;
        } else{
            return word;
        }
        
    }
}