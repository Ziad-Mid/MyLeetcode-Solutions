class Solution {
    public int longestPalindrome(String s) {
        
        //Store the occurence of each Character in the String
        Map<Character, Integer> counts = new HashMap<>();
        //Longest Palindrom
        int longestPalindrom = 0 ;
        //flag to indicate if a Character with odd count is found
        boolean oddNumberExist = false ;
        
        for (char c : s.toCharArray()) {
            counts.put(c, counts.getOrDefault(c, 0) + 1);
        }
        
        
        for(int count : counts.values()){
            if(count%2 == 0)
                longestPalindrom += count;
            else{
                longestPalindrom +=count-1;
                oddNumberExist = true;
            }
        }
        
        if(oddNumberExist)
            longestPalindrom++;
        
        return longestPalindrom;
        
    }
}