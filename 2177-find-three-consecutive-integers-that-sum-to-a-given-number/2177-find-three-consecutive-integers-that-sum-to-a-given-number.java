class Solution {
    public long[] sumOfThree(long num) {
        long arr[] = new long[3];
            long f1 = num/3, f2 = f1-1, f3 = f1+1;
            if(f1 + f2 + f3 == num){
                arr[0] = f2;
                arr[1] = f1;
                arr[2] = f3;
                return arr;
            }
        return new long[0];
    }
}