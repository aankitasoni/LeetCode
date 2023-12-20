class Solution {
    public int findPoisonedDuration(int[] t, int duration) {
        if (t.length < 1) return 0;
        int total = duration;
        for (int i = 1; i < t.length; i++){
            total += Math.min(t[i] - t[i-1], duration);
        }
        return total;
    }
}
