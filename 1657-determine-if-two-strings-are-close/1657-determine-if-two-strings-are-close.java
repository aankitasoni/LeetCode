class Solution {
    public boolean closeStrings(String s, String t) {
     int sCount[] = new int[26];
     int tCount[] = new int[26];
        
        int sSet[] = new int[26];
     int tSet[] = new int[26];
        
        
        for (int c : s.toCharArray()){
            sSet[c-'a'] = 1;
            sCount[c - 'a']++;
        }
        
        for (int c : t.toCharArray()){
            tSet[c-'a'] = 1;
            tCount[c -'a']++;
        }
        
        if (!Arrays.equals(sSet, tSet)){
            return false;
        }

        Arrays.sort(sCount);
        Arrays.sort(tCount);
        
        return Arrays.equals(sCount, tCount);
    }
}