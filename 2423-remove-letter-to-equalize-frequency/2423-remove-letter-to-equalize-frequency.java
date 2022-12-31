class Solution {
    public boolean equalFrequency(String word) {
        
        int n = word.length();
        int[] count = new int[26];
        
        for(int i = 0 ; i < n ; i ++){
            char c = word.charAt(i);
            count[c - 'a'] ++;
        }
        
        for(int i = 0 ; i < n ; i ++){
            char c = word.charAt(i);
            
            count[c - 'a'] --;
            
            if (equalArray(count)) {
                return true;
            }
            
            count[c - 'a'] ++;
            
        }
        
        return false;
    }
    
    private boolean equalArray(int[] count){
        int c = 0;
        
        for (int i: count){
            if (i == 0) continue;
            if (c != 0 && i != c) 
                return false;
            c = i;
        }
        return true;
    }
}