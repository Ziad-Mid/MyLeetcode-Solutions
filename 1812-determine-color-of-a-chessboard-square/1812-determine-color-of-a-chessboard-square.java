class Solution {
    public boolean squareIsWhite(String coordinates) {
        
        char letter = coordinates.charAt(0);
        int number = Character.getNumericValue(coordinates.charAt(1));  
        
        int letterToNum = (int) letter - 96 ;
        
        int sum = letterToNum + number ;
        
        if(sum%2 == 0)
            return false;
        else
            return true;
        
    }
}