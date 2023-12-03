class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        
      
        HashSet<Character> set = new HashSet<>();
        
        int answer =0;
        for(int i = 0 ; i < allowed.length() ; i++){
            set.add(allowed.charAt(i));
        }
        
        for(String word : words){
            int countNonAllowed =0;
            for(int j =0;j<word.length();j++){
            
            if(!set.contains(word.charAt(j)))
                countNonAllowed ++;
           
            
            
        }
         if(countNonAllowed == 0){
                answer ++;
            }
        
        }
      
        
        return answer;
    }
}