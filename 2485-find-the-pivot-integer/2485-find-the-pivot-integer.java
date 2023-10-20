class Solution {
    public int pivotInteger(int n) {
        int sum =0, left = 0;
        for (int i =1; i<=n; i++){
            sum += i;
        }
        for (int i =1; i<= n; left += i++){
            if (2*left == sum - i){
                return i;
            }
        }
        return -1;
    }
}

//  int sum = n(n+1)/2;
//         int
//     1 2 3 4 5 6 7 8 = i
//     1 = 1+2+3+..
//     1+2 = 2+3+4+5...
//     1+2+3 = 3+4+5..
//     1+2+3+4+5+6 = 6+7+8
        
        
//     1+2+3+4+5 = 7+8             --- 15
        
     
//     4* 9 = 36
    
//     1+2+3 
//     1+2+3+4+5+6
//     maths is not mathing