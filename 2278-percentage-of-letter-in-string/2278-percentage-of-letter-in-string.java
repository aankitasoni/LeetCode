class Solution {
    public int percentageLetter(String s, char letter) {
      
        int n = s.length();
        int count =0;
        for(int i =0; i < n; i++){
            if(s.charAt(i) == letter){
                count++;
            }
        }
        return (count *100)/n;
    }
}