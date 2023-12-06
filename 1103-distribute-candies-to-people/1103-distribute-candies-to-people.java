class Solution {
    public int[] distributeCandies(int candies, int num) {
        int ans[] = new int[num];
        int i = 0, j =0;
        while (candies > 0){
            int p = Math.min(candies, j+1);
            ans[i++ % num] += p;
            candies -= i;
            j = i;
        }
        return ans;
    }
}

