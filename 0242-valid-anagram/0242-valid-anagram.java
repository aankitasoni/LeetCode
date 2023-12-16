class Solution {
    public boolean isAnagram(String s, String t) {
        int ch[] = new int[26];
       for (int i =0; i < s.length(); i++){
           ch[s.charAt(i) - 'a']++;
       }
        for (int i =0; i<t.length(); i++){
            ch[t.charAt(i) - 'a']--;
        }
        for (int i : ch){
            if (i != 0) return false;
        }
        return true;
    }
}

       // char[] a = s.toCharArray();
       //  Arrays.sort(a);
       //  String s1 = new String(a);
       //  char[] b = t.toCharArray();
       //  Arrays.sort(b);
       //  String s2 = new String(b);
       //  if(s1.equals(s2)){
       //      return true;
       //  }
       //  return false;
