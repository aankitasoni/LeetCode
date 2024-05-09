class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);

        reverseArray(happiness);

        int selected = 0;
        long happinessScore = 0; 
        for (int score : happiness) {
            if (selected == k) {
                break; 
            }
            happinessScore += Math.max(0, score - selected);
            selected++;
        }

        return happinessScore;
    }

    private void reverseArray(int[] array) {
        for (int i = 0, j = array.length - 1; i < j; i++, j--) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
}