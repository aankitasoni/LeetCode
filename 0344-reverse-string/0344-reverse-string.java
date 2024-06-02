class Solution {
    public void reverseString(char[] s) {
        char rev[] = new char[s.length];
        for (int i = s.length-1; i >= 0; i--){
            rev[i] += s[s.length-i-1];
        }
        for(int i=0;i<s.length;i++){
            s[i]=rev[i];
        }
    }
}

