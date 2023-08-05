class Solution {
    public char repeatedCharacter(String s) {
        List<Character> al = new ArrayList<>();
        char aa = 'a';
        for(int i=0; i<s.length(); i++) {
            if(al.contains(s.charAt(i))) {
                aa = s.charAt(i);
                break;
            }
            else {
                al.add(s.charAt(i));
            }
        }
        return aa;
    }
}
