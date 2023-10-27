class Solution {
    public int maxVowels(String s, int k) {
        int count =0, total=0, i=0;
        for (; i <k; i++){
            if(vowel(s.charAt(i))){
                count++;
            }
        }
        
        total = count;
        for (; i<s.length(); i++){
            if (vowel(s.charAt(i))) count++;
            if (vowel(s.charAt(i-k))) count--;
            total = Math.max(count,total);
        }
        return total;
        
    }
    public boolean vowel(char c){
        if (c == 'a' || c=='e' || c=='i' || c=='o' || c=='u'){
            return true;
        }
        return false;
    }
}

