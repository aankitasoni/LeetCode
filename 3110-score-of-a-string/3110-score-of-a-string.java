class Solution {
    public int scoreOfString(String s) {
        int p[] = new int[s.length()];
        for (int i =0; i < s.length(); i++){
            p[i] += s.charAt(i) - 0;
        }
        int sum = 0;
        for (int i =1; i < p.length; i++){
            sum += Math.abs(p[i-1] - p[i]);
        }
        return sum;
    }
}