class Solution {
    public boolean isAnagram(String s, String t) {
        char[] c = s.toCharArray();
        Arrays.sort(c);
        String s1 = new String (c);
        char[] d = t.toCharArray();
        Arrays.sort(d);
        String t1 = new String (d);
        if (s1.equals(t1)){
            return true;
        } else {
            return false;
        }
    }
}