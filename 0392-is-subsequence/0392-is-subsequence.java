class Solution {
    public boolean isSubsequence(String s, String t) {
        
        int i = 0 ;
        int currentSearchable = 0 ;
        
        while(i < t.length() && currentSearchable< s.length() ){
            Character cT = t.charAt(i);
            Character cS = s.charAt(currentSearchable);
            if(cT.equals(cS)){
                currentSearchable++;
            }
            i++;
        }
        
        return currentSearchable == s.length();
    }
}
