class Solution {
    public boolean isPathCrossing(String s) {
        Set<String> st = new HashSet<>();
        st.add(0 + ", " + 0);
        int e = 0, o = 0;
        for (int i =0; i < s.length(); i++){
            if (s.charAt(i) == 'N') o++;
            else if (s.charAt(i) == 'S') o--;
            else if (s.charAt(i) == 'E') e++;
            else if(s.charAt(i) == 'W') e--;
            if (!st.add(e + ", " + o)) return true;
        }
        
        return false;
    }
}