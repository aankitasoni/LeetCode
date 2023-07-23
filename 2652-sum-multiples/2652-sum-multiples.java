class Solution {
    public int sumOfMultiples(int n) {
        int sum =0;
        for (int i = 1; i <= n; i++){
            int sum3 = 0;
            int sum5 = 0; 
            int sum7 = 0;
            if (i % 3 == 0){
                sum3 += i;
            } else if(i % 5 == 0){
                sum5 += i;
            }
            else if (i % 7 == 0){
                sum7 += i;
            }
            sum += sum3 + sum5 + sum7;
        }
        return sum;
    }
}