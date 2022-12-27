class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        
        HashMap<Character, Integer> letters = new HashMap<>();
        String shortestWord = "qwer78iocfygbanafdvijrpnvwfvksfv";
        
        for(int i = 0 ; i < licensePlate.length() ; i ++){
            if(Character.isAlphabetic(licensePlate.charAt(i)))
            {   
                char c = Character.toLowerCase(licensePlate.charAt(i));
                letters.put(c, letters.getOrDefault(c,0)+1);
            }
        }
        
        for(int i = 0 ; i < words.length ; i ++ )
        {
        String s = words[i].toLowerCase();
            
        HashMap<Character, Integer> lettersCopy = new HashMap<Character, Integer>(letters);
            
            for(int j = 0 ; j < words[i].length();j++)
            {   
                char wordsCharacter = words[i].charAt(j);
                if(lettersCopy.containsKey(wordsCharacter) && lettersCopy.get(wordsCharacter) > 0){
                    lettersCopy.put(wordsCharacter,lettersCopy.get(wordsCharacter)-1);
                }
                
            }
            //check if all value are zero means all characters are in the word
            boolean isCompletingWord = true ;
            for ( Integer value: lettersCopy.values()) {
                if (value != 0) {
                    isCompletingWord = false;
                }
            }
            
           
            
            if(shortestWord.length() > words[i].length() && isCompletingWord == true){
                
                shortestWord = words[i];
            }
            
           
            
        }
            
        return shortestWord;
    }
}