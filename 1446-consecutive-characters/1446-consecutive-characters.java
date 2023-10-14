class Solution {
    public int maxPower(String s) {
        int count = 0, max = 0;
        for (int i =0; i<s.length()-1; i++){
            if (s.charAt(i) == s.charAt(i+1)){
                count++;
            } else {
                max = Math.max(count, max);
                count = 0;
            }
            
        }
        return Math.max(count,max)+1;
    }
}