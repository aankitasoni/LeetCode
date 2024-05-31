class Solution {
    public String reverseOnlyLetters(String s) {
        Stack<Character> st = new Stack<>();
        for (int i =0 ; i< s.length(); i++){
            if(Character.isLetter(s.charAt(i))){
                st.push(s.charAt(i));
            }
        }
        
        StringBuilder ans = new StringBuilder();
        
        for (int i =0; i<s.length(); i++){
            if(Character.isLetter(s.charAt(i))){
                ans.append(st.pop());
            } 
            else ans.append(s.charAt(i));
        }
        return ans.toString();
    }
}