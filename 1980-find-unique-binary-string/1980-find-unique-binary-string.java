class Solution {
    public String findDifferentBinaryString(String[] nums) {
        String s = "";
        for (int i =0; i < nums.length; i++){
            char ch = nums[i].charAt(i);
            if (ch == '0'){
                ch = '1';
            } else {
                ch = '0';
            }
            s += ch;
        }
        return s;
    }
}