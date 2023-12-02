class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        
        List<Character> charAllowedList = new ArrayList<>();
        int count = 0;
        char[] allowedChar = allowed.toCharArray();
        
        for(char charAllowd : allowedChar ){
            charAllowedList.add(charAllowd);
        }
        
        for( String word : words){
            char[] wordChar = word.toCharArray();
            int charCount = 0 ;
                
            for(char ch : wordChar){
                if(!charAllowedList.contains(ch))
                    break;
                charCount++;
            }
            
            if(charCount == word.length())
                count++;
            
        }
        
        return count;
    }
}