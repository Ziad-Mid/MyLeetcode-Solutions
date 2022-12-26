class Solution {
    public boolean isSameAfterReversals(int num) {
        
        
        // Integer.parseInt(sb.reverse().toString())
        
        int reversed1 = reverseMethod(num);
        
        
        int reversed2 = reverseMethod(reversed1);
        
        
        
        return reversed2 == num ? true : false;
    }
    
    public static int reverseMethod(int number){
        
        String numString = Integer.toString(number);
        StringBuilder sb = new StringBuilder(numString);
        String reversedString = sb.reverse().toString();
        
        int reversed = Integer.parseInt(reversedString);
        
        return reversed;
    }
}