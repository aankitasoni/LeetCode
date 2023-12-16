class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> al = new ArrayList<>();
        al.add(words[0]);
        for (int i = 1; i < words.length; i++){
            if (!isanagram(words[i-1], words[i])){
                al.add(words[i]);
            }
        }
        return al;  
    }
    
    public boolean isanagram(String s, String t){
        int ch[] = new int[26];
        for (int i = 0; i < s.length(); i++){
            ch[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++){
            ch[t.charAt(i)-'a']--;
        }
        for (int i : ch){
            if (i != 0){
                return false;
            }
        }
        return true;
    }
}

