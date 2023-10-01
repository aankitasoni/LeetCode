class Solution {
    public String reverseWords(String s) {
      String arr[] = s.split(" ");
        String rev = "";
        for (String p : arr){
            StringBuilder sb = new StringBuilder(p);
            sb.reverse();
            rev += sb.toString()+ " ";
        }
        return rev.trim();
    }
}