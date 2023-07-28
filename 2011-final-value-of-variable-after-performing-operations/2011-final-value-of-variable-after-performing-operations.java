class Solution {
    public int finalValueAfterOperations(String[] o) {
       int a =0;
        for (int i=0; i<o.length; i++){
            if (o[i].equals("++X") || o[i].equals("X++")){
                a++;
            } else if (o[i].equals("--X") || o[i].equals("X--")){
                a--;
            }
        }
                            return a;
    }
}

