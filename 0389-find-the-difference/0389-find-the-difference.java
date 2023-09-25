class Solution {
    public char findTheDifference(String s, String t) {
            char[] c = s.toCharArray();
            char[] d = t.toCharArray();
        int p = 0;
        for (int i=0; i< c.length; i++){
            p -= c[i];
        }
        for (int i =0; i< d.length; i++){
            p += d[i];
        }
        return (char)p;
}
}

