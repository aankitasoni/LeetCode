class Solution {
    public int nthUglyNumber(int n) {
        // int p = 1;
        int f2 =0, f3 =0, f5 =0;
        int arr[] = new int[n];
        arr[0] = 1;
       for (int i =1; i < n; i++){
           arr[i] = Math.min(arr[f2] *2, Math.min(arr[f3]*3, arr[f5] *5));
           if(arr[i] == arr[f2]*2) f2++;
           if(arr[i] == arr[f3]*3) f3++;
           if(arr[i] == arr[f5]*5) f5++;
       }
        return arr[n -1];
    }
}
