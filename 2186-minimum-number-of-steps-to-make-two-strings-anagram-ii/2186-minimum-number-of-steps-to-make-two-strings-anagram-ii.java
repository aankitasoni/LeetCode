class Solution {
    public int minSteps(String s, String t) {
        
        int sCount[] = new int[26];
        int tCount[] = new int[26];
        
       for (int c : s.toCharArray()){
            sCount[c - 'a']++;
        }
        
        for (int c : t.toCharArray()){
            tCount[c -'a']++;
        }
         int ans = 0;
        for (int i =0; i < 26; i++){
                ans += Math.abs(sCount[i] - tCount[i]);
            
        }
        return ans;
    }
}