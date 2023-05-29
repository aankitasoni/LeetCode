class Solution {
    public int addDigits(int num) {
         if( num % 9 == 0 && num != 0 )
            return 9;       // %9 --> want single digit
        if( num > 9)
            return num % 9;   
        return num;
    }
}