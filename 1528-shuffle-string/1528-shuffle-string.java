class Solution {
    public String restoreString(String s, int[] indices) {
        List<Integer> al = new ArrayList<>();
        for (int i: indices){
            al.add(i);
        }
        String a = "";
        for (int i=0; i< indices.length; i++){
            int p = al.indexOf(i);           // 0 -- 4
            a += String.valueOf(s.charAt(p));
        }
        return a;
    }
}
