class Solution {
    public String mergeAlternately(String word1, String word2) {
        int length1 = word1.length();
        int length2 = word2.length();
        
        int maxLength = length1 > length2 ?length1 : length2 ;
        
        StringBuilder result = new StringBuilder();
        
        for(int i = 0 ; i < maxLength ; i++){
            
            if(i < length1 && i < length2)
            {
                result.append(word1.charAt(i));
                result.append(word2.charAt(i));
            }
            else if(i < length1 && i >= length2)
            {
                result.append(word1.charAt(i));
            }
            else if(i >= length1 && i < length2)
            {
                result.append(word2.charAt(i));
            }
        }
        
        
        return result.toString();
        
    }
}