class Solution {
    public int canBeTypedWords(String t, String b) {
        int count = 0;
        String s[] = t.split(" ");
        for (int i =0; i < s.length; i++){
            if (cantype(s[i], b)){
                count++;
            }
        }
        return count;
    }
    
    public static boolean cantype(String p, String x){
        for (char c : x.toCharArray()) {
        if (p.contains(String.valueOf(c))) {
            return false;
        }
    }
    return true;
    }
}