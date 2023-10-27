class Solution {
    public int[] separateDigits(int[] nums) {
        String s = "";
        for (int i : nums){
            s += i;
        }
        int arr[] = new int[s.length()];
        for (int i =0; i<s.length(); i++){
            arr[i] = s.charAt(i)-'0';
        }
        return arr;
    }
}
