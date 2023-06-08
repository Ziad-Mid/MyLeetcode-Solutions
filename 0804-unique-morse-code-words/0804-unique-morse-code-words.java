class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morseTable = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        
        Map<String,Integer> hm = new HashMap<>();
        
        for(String s : words){
            char[] wordsChar = s.toCharArray();
            StringBuilder morseWord = new StringBuilder();
            for(char c : wordsChar){
                int charToMorse = (int) c - 97;
                morseWord.append(morseTable[charToMorse]);
            }
            
            hm.put(morseWord.toString(),hm.getOrDefault(morseWord.toString(),1) + 1);
            
        }
        
        return hm.size();
    }
}