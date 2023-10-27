class Solution {
    public int minimumRecolors(String blocks, int k) {
        int count =0, total =0, i = 0; 
        for (; i < k; i++){
            if(blocks.charAt(i) == 'B'){
                count++;
            }
        }
        total = count;
        for (; i <blocks.length(); i++){
            if ((blocks.charAt(i) == 'B')) count++;
            if((blocks.charAt(i-k)) == 'B') count--;
            total = Math.max(total,count);
        }
        return k-total;
    }
   
    }


