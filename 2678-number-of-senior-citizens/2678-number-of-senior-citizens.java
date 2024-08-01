class Solution {
    public int countSeniors(String[] details) {
        int count = 0;
        for (int i =0; i <details.length; i++){
            String p = details[i];
            // if (Character.isDigit(p.charAt(11)) >= 6 && Character.isDigit(p.charAt(12))  > 0){
            //     count++;
            // }
            int tens = p.charAt(11) -'0';
            int ones = p.charAt(12) -'0';
            int age = tens *10 + ones;
            if (age > 60){
                count++;
            }
        }
        return count;
    }
}