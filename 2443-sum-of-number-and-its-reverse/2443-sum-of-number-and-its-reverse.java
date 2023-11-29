class Solution {
    public boolean sumOfNumberAndReverse(int num) {
        for(int i = 0; i <=num; i++){
            if(i + rev(i) == num){
                return true;
            }
        }
        return false;
    }
    public static int rev(int a){
        char c[] = String.valueOf(a).toCharArray();
        String reverse = "";
        for(int i = c.length-1; i >= 0; i--){
            reverse += c[i];
        }
        return Integer.parseInt(reverse);
        
        
    }
}

//          for (int i = 0; i <= num; i++) {
//             int rev = 0;
//             int temp = i;

//             while (temp != 0) {
//                 int r = temp % 10;
//                 rev = rev * 10 + r;
//                 temp = temp / 10;
//             }
//             if ((i + rev) == num) {
//                 return true;
//             }
//         }
        
//         return false;