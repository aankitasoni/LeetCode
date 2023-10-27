class Solution {
    public int longestContinuousSubstring(String s) {
        int count = 1, total =1;
        for (int i =0; i<s.length()-1; i++){
            if (s.charAt(i)-'a' + 1 == s.charAt(i+1)-'a'){
                count++;
                total = Math.max(count, total);
            } else {
                count =1;
            }
        }
        return total;
    }
}