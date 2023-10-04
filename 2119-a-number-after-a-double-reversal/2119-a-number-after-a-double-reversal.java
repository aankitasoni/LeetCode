class Solution {
    public boolean isSameAfterReversals(int num) {
        return num == 0 || num%10 != 0;    
        // number contains 0 at last 
        // 2 same then % same 
    }
}