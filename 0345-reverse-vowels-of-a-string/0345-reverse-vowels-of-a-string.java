class Solution {
    public String reverseVowels(String s) {
        HashSet<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        set.add('A');
        set.add('E'); 
        set.add('I'); 
        set.add('O'); 
        set.add('U');
        
        StringBuilder temp = new StringBuilder();
        StringBuilder res = new StringBuilder(s);
        
        for (char c : s.toCharArray()){
            if(set.contains(c)){
                temp.append(c);
            }
        }
        
        temp.reverse();
        
        int vIndex = 0;
        for (int i =0; i < s.length(); i++){
            if(set.contains(s.charAt(i))){
                res.setCharAt(i, temp.charAt(vIndex));
                vIndex++;
            }
        }
        return res.toString();
    }
}