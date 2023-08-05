class Solution {
    public int percentageLetter(String s, char letter) {
        int l = s.length();
        char[] c = s.toCharArray();
        int count =0;
        for (int i=0; i<c.length; i++){
            if (c[i] == letter){
                count++;
            }
        }
         return (count * 100) / l;
        
    }
}