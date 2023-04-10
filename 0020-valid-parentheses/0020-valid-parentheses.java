class Solution {
     public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        String openeningBracket = "({[";
        String closingBracket = ")}]";
        
        if(s.length() == 1)
            return false;
            
         for(int i = 0; i<s.length(); i++){
             
             if(openeningBracket.indexOf(s.charAt(i)) != -1)
                 stack.push(s.charAt(i));
             
             if(closingBracket.indexOf(s.charAt(i)) != -1)
             {
                 int idex = closingBracket.indexOf(s.charAt(i));
                 if(stack.size() == 0)
                    return false;  
                 else if(stack.peek() == openeningBracket.charAt(idex))
                   { 
                     stack.pop();
                    }
                 else{
                     return false;
                 }
             }   
        }
        
        if(stack.size() == 0)
            return true;
        return false;
    }
}