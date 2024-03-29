class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> al =new ArrayList<>();
        for (int i = left; i<= right;i++){
            if (isSD(i)){
                al.add(i);
            }
        }
        return al;
    }
    
    public static boolean isSD(int num){
        for (char c : String.valueOf(num).toCharArray()){
            if (c == '0' || num % (c-'0') > 0 ){
                return false;
            }
        }
        return true;
    }
    
}