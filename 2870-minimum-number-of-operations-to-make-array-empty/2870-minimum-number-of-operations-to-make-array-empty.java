class Solution {
    public int minOperations(int[] nums) {
       Map<Integer, Integer> mp = new HashMap<>();
        for (int i : nums){
            mp.put(i, mp.getOrDefault(i, 0)+1);
        }
        int count = 0;
        for (int i : mp.values()){
            if (i < 2) return -1;
            count += i/3;
            if (i%3 > 0) count++;
        }
        return count;
    }
}