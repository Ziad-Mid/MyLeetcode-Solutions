class Solution {
    public boolean isSubsequence(String s, String t) {
        
        int i = 0 ;
        int currentSearchable = 0 ;
        Stack<Character> stack = new Stack<Character>();
        
        while(i < t.length() && currentSearchable< s.length() ){
            Character cT = t.charAt(i);
            Character cS = s.charAt(currentSearchable);
            if(cT.equals(cS)){
                stack.push(cT);
                currentSearchable++;
                
            }
            
            i++;
        }
        
        return stack.size() == s.length() ? true : false;
    }
}

//stack = a
//k =1
//