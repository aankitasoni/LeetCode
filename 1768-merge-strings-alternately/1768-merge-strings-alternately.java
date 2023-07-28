class Solution {
    public String mergeAlternately(String word1, String word2) {
       String s = "";
        char a[] = word1.toCharArray();
        char b[] = word2.toCharArray();
        
        List<Character> al = new ArrayList<>();
        for (int i =0; i<a.length; i++){
            al.add(a[i]);
        }
        List<Character> all = new ArrayList<>();
        for (int i =0; i <b.length; i++){
            all.add(b[i]);
        }
        
            if (a.length < b.length){
                for (int i = 0; i<a.length; i++){
                    s += String.valueOf(a[i]) + String.valueOf(b[i]);
                }
                s += word2.substring(word1.length());
            } else {
                for (int i=0; i<b.length; i++){
                    s += String.valueOf(a[i]) + String.valueOf(b[i]);
                }
                s += word1.substring(word2.length());
            }
            
        
        return s;
    }
}

