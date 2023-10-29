class Solution {
    public long findTheArrayConcVal(int[] nums) {
        int i =0, n = nums.length-1;
        long ans = 0;
        while(i <= n){
            String s1 = Long.toString(nums[i]), s2 = Long.toString(nums[n]);
            s1 += s2;
            if (i == n) ans+= nums[i];
            else ans += Long.parseLong(s1);
            i++;
            n--;
        }
        return ans;
    }
}
