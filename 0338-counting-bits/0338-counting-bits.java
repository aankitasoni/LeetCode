class Solution {
    public int[] countBits(int n) {
        int s[] = new int[n+1];
        for (int i =0; i <=n; i++){
             String a = Integer.toBinaryString(i);
            int count = 0;
            for (int j =0; j < a.length() ; j++){
                if (a.charAt(j) == '1'){
                    count ++;
                }
            }
            s[i] = count;
        }
        return s;
    }
}
