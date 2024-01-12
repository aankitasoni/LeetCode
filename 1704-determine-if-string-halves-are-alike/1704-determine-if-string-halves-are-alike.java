class Solution {
    public boolean halvesAreAlike(String s) {
        String vowels = "aeiouAEIOU";
        int n = s.length();
        String a = s.substring(0, n/2);
        String b = s.substring(n/2);
        
        int ca = 0, cb = 0;
        for (int i =0; i < a.length(); i++){
            if (vowels.indexOf(a.charAt(i)) != -1){
                ca++;
            }
        }
        for (int i =0; i < b.length(); i++){
            if (vowels.indexOf(b.charAt(i)) != -1){
                cb++;
            }
        }
        return ca == cb;
    }
}

// 1 2 3 4 5 6