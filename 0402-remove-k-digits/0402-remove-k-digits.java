class Solution {
    public String removeKdigits(String num, int k) {
         Stack<Character> stack = new Stack<>();
    StringBuilder sb = new StringBuilder();
    
    
    for(int i=0;i<num.length();i++){
        char curr = num.charAt(i);
        
            
        while(!stack.empty() && stack.peek() > curr && k > 0){
            stack.pop();
            k--;   
        }
        if(!stack.empty() || curr!='0'){
        stack.push(curr);
            
        }
         
    }
    
    while(!stack.empty() && k > 0){
        stack.pop();
        k--;
    }
     
    for(char ch : stack){
        sb.append(ch);
    }
       
   return stack.empty() ? "0" : sb.toString(); 
    }
}