class Solution {
    public int minimumBuckets(String s) {
        if(s.equals("H") || s.startsWith("HH") || s.endsWith("HH") || s.contains("HHH")) return -1;
        else return s.replace("H.H", "  ").length() - s.replace("H", "").length();
    }
}