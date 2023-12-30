class Solution {
    public boolean makeEqual(String[] words) {
        //if (words.length == 1) return true;
        
        int ch[] = new int[26];
        for (String s : words){
            for (char c : s.toCharArray()){
                ch[c-'a']++;
            }
        }
        
        int n = words.length;
        for (int i : ch){
            if (i % n !=0) return false;
        }
        return true;
    }
}
