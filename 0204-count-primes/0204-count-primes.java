class Solution {
    public int countPrimes(int n) {
        boolean prime[] = new boolean[n];
        int count =0;
        for (int i = 2; i <n; i++){
            if (!prime[i]){
                count++;
                for (long j = (long)i*i; j < n; j= j+i){
                    prime[(int)j] = true;
                }
            }
        }
        return count;
    }
}
