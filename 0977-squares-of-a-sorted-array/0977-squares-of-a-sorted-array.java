class Solution {
    public int[] sortedSquares(int[] nums) {
        
        int a[] = new int[nums.length];
        for (int i =0; i <a.length; i++){
            int p = (int)Math.pow(nums[i], 2);
            a[i] = p;
        }
        Arrays.sort(a);
        return a;
        
//         double p = 0;
//         for (int i=0 ; i < nums.length; i++){
//             p = Math.pow(nums[i] , 2);
            
//         }
//         return Arrays.sort((int)p);
    }
}