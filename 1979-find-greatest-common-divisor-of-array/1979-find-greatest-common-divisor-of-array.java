import java.lang.Math;

class Solution {
    public int findGCD(int[] nums) {
       int min = nums[0];
        int max = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(nums[i] > max){
                max = nums[i];
            } 
            if(nums[i] < min){
                min = nums[i];
            }
        }
        return gcd(max, min);
    }
    
    public static int gcd(int a, int b){
        if (a==0 || b ==0){
            return a^b;
        }
        if(b > a){
            return gcd(b, a);
        }
        return gcd(a%b, b);
    }
}