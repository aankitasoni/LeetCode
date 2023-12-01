class Solution {
    public boolean isValid(String s) {
     while (s.length() != 0){
         String p = s.replace("()", "").replace("[]", "").replace("{}", "");
         if (s.equals(p)){
             return false;
         }
         s = p;
     }
        return true;
    }
}