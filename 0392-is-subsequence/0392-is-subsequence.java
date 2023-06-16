class Solution {
    public boolean isSubsequence(String s, String t) {
        
        int i = 0 ;
        int currentSearchable = 0 ;
        
        while(i < t.length() && currentSearchable< s.length() ){
            if(t.charAt(i) == s.charAt(currentSearchable)){
                currentSearchable++;
            }
            i++;
        }
        
        return currentSearchable == s.length();
    }
}
