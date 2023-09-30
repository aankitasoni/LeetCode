class Solution {
    public String maximumOddBinaryNumber(String s) {
        String s1 = "", s2 = "";
        char a[] = s.toCharArray();
        Arrays.sort(a);
        s1 = new String(a);
       
        for (int i = s1.length()-2; i >= 0;i--){
           s2 +=  String.valueOf(s1.charAt(i));
        }
        return s2+1;
    }
}
