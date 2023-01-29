class Solution {
    public boolean isCircularSentence(String sentence) {
        String[] arrOfSentence = sentence.split(" ", -1);
        int n = arrOfSentence.length;
        boolean result = true ;

        if(n == 1){
            System.out.println("Here");
            int lengthOfWord = arrOfSentence[0].length();
            Character c = arrOfSentence[0].charAt(0);
            if(c.equals(arrOfSentence[0].charAt(lengthOfWord-1)))
                return true;
            
            return false;
        }
        else{
            for(int i = 1 ; i < n ; i++){
                Character c2 = arrOfSentence[i].charAt(0);
                int prevStrLength = arrOfSentence[i-1].length();
                if(!c2.equals(arrOfSentence[i-1].charAt(prevStrLength-1)))
                    return false;
            }
            Character firstCharacter = arrOfSentence[0].charAt(0);
            int lastStrLength = arrOfSentence[n-1].length();
            if(!firstCharacter.equals(arrOfSentence[n-1].charAt(lastStrLength-1)))
                return false;
        }
        

        return true;
    }
}