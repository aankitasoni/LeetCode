class Solution {
    public boolean digitCount(String num) {
        char[] ch = new char[10];
        for (char c : num.toCharArray()){
            ch[c-'0']++;
        }
       
        for (int i =0; i<num.length(); i++){
            if (num.charAt(i)-'0' != ch[i]){
                return false;
            }
        }
        return true;
    }
}