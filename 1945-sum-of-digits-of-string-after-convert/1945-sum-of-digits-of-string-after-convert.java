class Solution {
    public int getLucky(String s, int k) {
        String p = "";
        for (char c : s.toCharArray()){
            p += c-'a'+1;
        }
        int sum =0;
        while(k >0){
            for (char c: p.toCharArray()){
                sum += c-'0';
            }
            p = String.valueOf(sum);
            k--;
            if (k == 0) break;
            sum = 0;
        }
        return sum;
    }
}