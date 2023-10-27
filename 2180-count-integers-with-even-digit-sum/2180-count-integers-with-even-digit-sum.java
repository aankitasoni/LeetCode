class Solution {
    public int countEven(int num) {
        int count =0;
        for (int i = 2; i<= num; i++){
           if(sumofdigit(i)){
               count++;
           }
        }
        return count;
    }
     boolean sumofdigit(int n){
        int digit = 0;
      while(n > 0){
          digit += n %10;
          n /= 10;
      }
        return digit % 2 ==0;
    }
    
}


