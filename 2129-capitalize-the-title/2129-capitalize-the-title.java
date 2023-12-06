class Solution {
    public String capitalizeTitle(String title) {
        String ss[] = title.split(" ");
        StringBuilder sb = new StringBuilder();
        
        for (int i =0; i <ss.length; i++){
            ss[i] = ss[i].toLowerCase();
            
            if(ss[i].length() <= 2){
                sb.append(ss[i]).append(" ");
            } else {
                ss[i] = ss[i].substring(0,1).toUpperCase() + ss[i].substring(1);
                sb.append(ss[i]).append(" ");
            }
        }
        return sb.toString().trim();
    }
}

