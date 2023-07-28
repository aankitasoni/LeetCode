class Solution {
    public int maximum69Number (int num) {
       String s = String.valueOf(num);
        for (int i=0; i< s.length(); i++){
            if(s.charAt(i) == '9'){
                continue;
            } else {
                s = s.replaceFirst("6", "9");
                break;
            }
        }
        int a = Integer.parseInt(s);
        return a;
    }
}