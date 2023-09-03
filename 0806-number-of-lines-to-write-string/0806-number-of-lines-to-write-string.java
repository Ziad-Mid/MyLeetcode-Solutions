class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        
        int length = s.length();
        int currentLineLength = 0;
        int numberOfLines = 0;
        int[] result = new int[2];
        
        for(int i = 0 ; i < length ; i++){
            
            currentLineLength += widths[s.charAt(i) - 97];
            
            if(currentLineLength > 100){
                currentLineLength = 0;
                numberOfLines++;
                i--;
                
            }
            
        }
        result[0] = ++numberOfLines; //Adding last line
        result[1] = currentLineLength;
        
        
        return result;
        
    }
}