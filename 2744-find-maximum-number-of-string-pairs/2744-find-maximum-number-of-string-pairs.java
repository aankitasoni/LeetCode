class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        int res = 0;
        for (int i =0; i <words.length; i++){
            for (int j = i+1; j<words.length; j++){
                if (words[i].equals(words[j].charAt(1) + "" + words[j].charAt(0))){
                    res++;
                    break;
                }
            }
        }
        return res;
    }
}


