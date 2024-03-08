class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer, Integer> mp = new HashMap<>();
        int maxFreq = 0;
        for(var num : nums){
            mp.put(num, mp.getOrDefault(num, 0) + 1);
            maxFreq = Math.max(maxFreq, mp.get(num));
        }

        int maxFreqEleCnt = 0;
        for(var entry : mp.entrySet()){
            int currEleFreq = entry.getValue();
            if(currEleFreq == maxFreq){
                maxFreqEleCnt++;
            }
        }
        return maxFreq * maxFreqEleCnt;
    }
}