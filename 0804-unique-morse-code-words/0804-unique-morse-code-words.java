class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morseTable = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        
        HashSet<String> set=new HashSet<>();
        
        for(String s : words){
            char[] wordsChar = s.toCharArray();
            StringBuilder morseWord = new StringBuilder();
            for(char c : wordsChar){
                int charToMorse = (int) c - 97;
                morseWord.append(morseTable[charToMorse]);
            }
            
            set.add(morseWord.toString());
            
        }
        
        return set.size();
    }
}