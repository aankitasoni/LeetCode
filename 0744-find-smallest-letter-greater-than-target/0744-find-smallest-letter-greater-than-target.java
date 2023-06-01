class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        List<Character> al = new ArrayList<>();
        for (char i : letters){
            al.add(i);
        }
        
        int index = 0;
        for (int i =0; i < al.size() ; i++){
            if(al.get(i) > target){
                index = i;
                break;
            }
        }
       return al.get(index);
    }
}

