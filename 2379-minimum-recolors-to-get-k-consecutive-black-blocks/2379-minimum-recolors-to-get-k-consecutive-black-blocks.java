class Solution {
    public int minimumRecolors(String blocks, int k) {
        int count =0, total =0, i = 0; 
        for (; i < k; i++){
            if(sum(blocks.charAt(i))){
                count++;
            }
        }
        total = count;
        for (; i <blocks.length(); i++){
            if (sum(blocks.charAt(i))) count++;
            if(sum(blocks.charAt(i-k))) count--;
            total = Math.max(total,count);
        }
        return k-total;
    }
    public boolean sum(char c){
        if (c == 'B' || c == 'A'){
            return true;
        }
       return false; 
    }
}