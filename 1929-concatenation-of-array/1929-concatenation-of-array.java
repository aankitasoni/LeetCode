class Solution {
    public int[] getConcatenation(int[] nums) {
        
        int p = nums.length;
        int arr[] = new int[2*p];
        for (int i =0; i<p; i++){
            arr[i] = nums[i];
            arr[i+p] = arr[i];
        }
        return arr;
    }
}