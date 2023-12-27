class Solution {
    public int minCost(String c, int[] n) {
        int sum = 0;
        for (int i =1; i < c.length(); i++){
            if (c.charAt(i-1) == c.charAt(i)){
                sum += Math.min(n[i-1], n[i]);
                n[i] = Math.max(n[i-1], n[i]);
            }
        }
        return sum;
    }
}