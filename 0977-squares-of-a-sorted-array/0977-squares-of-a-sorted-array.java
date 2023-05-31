class Solution {
    public int[] sortedSquares(int[] nums) {
        
        int a[] = new int[nums.length];
        for (int i =0; i <a.length; i++){
            int p = (int)Math.pow(nums[i], 2);
            a[i] = p;
        }
        Arrays.sort(a);
        return a;
    }
}