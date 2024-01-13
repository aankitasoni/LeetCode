class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char sep) {
        List<String> al = new ArrayList<>();
        
        for (String i : words){
            String s[] = i.split("[" + sep + "]");
            for (String p : s){
                if (!p.equals("")){
                    al.add(p);
                }
            }
        } 
        return al;
    }
}