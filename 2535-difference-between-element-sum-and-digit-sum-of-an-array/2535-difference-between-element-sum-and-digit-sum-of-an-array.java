class Solution {
    public int differenceOfSum(int[] nums) {
        int esum = 0, dsum =0;
        for(int i : nums){
            esum += i;
        }
        String s = "";
        for (int i : nums){
            s += String.valueOf(i);
        }
        for (int i =0; i<s.length(); i++){
            char c = s.charAt(i);
            int digit = Character.getNumericValue(c);
            dsum += digit;
        }
        
        return Math.abs(esum - dsum);
    }
}