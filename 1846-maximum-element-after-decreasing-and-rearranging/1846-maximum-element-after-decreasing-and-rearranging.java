class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
       Arrays.sort(arr);
        // for (int i =1; i<arr.length; i++){
        //     if (arr[i-1] > arr[i]){
        //         int p = arr[i-1];
        //         arr[i-1] = arr[i];
        //         arr[i] = p;
        //     }
        // }
        
        int n = arr.length;
        int prev = 0;
        for (int i = 0; i <n; i++){
            if (arr[i] > prev){
                prev++;
            }
        }
        return prev;
    }
}