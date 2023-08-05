class Solution {
    public char repeatedCharacter(String s) {
        char c = 'a';
        List<Character> al = new ArrayList<>();
        for (int i=0; i<s.length(); i++){
            if (al.contains(s.charAt(i))){
                c = s.charAt(i);
                break;
            } else {
                al.add(s.charAt(i));
            }
        }
        return c;
    }
}