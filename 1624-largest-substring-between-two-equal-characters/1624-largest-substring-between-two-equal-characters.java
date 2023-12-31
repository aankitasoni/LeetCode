class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int max = -1;
        for (int i =0; i <s.length(); i++){
            char c = s.charAt(i);
            max = Math.max(max, s.lastIndexOf(c) - s.indexOf(c)-1);
        }
        return max;
    }
}