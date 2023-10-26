class Solution {
    public int countDigits(int num) {
        int count =0;
        for (char c : String.valueOf(num).toCharArray()){
            if (c == '0' || num% (c -'0') > 0){
                continue;
            } else {
                count++;
            } 
        }
        return count;
    }
}