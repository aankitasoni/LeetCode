class Solution {
    public boolean winnerOfGame(String c) {
        int a =0, b=0;
        for (int i =0; i < c.length()-2; i++){
            if (c.charAt(i) == 'A' && c.charAt(i+1) == 'A' && c.charAt(i+2) == 'A' ){
                a++;
            }
            else if (c.charAt(i) == 'B' && c.charAt(i+1) == 'B' && c.charAt(i+2) == 'B' ){
                b++;
            }
        }
        return a > b;
    }
}