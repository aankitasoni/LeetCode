class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> al = new ArrayList<>();
        int n = nums.length;
        for (int i = 1, j = 0; i <= n; i++){
            if (i == n ||  nums[i-1]+1 != nums[i]){
                if (j != i-1){
                    al.add(nums[j]+ "->" + nums[i-1]);
                } else {
                al.add(Integer.toString(nums[j]));
            }
                j = i;
            }
        }
        return al;
    }
}