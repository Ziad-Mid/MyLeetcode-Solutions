class Solution {
    public boolean isSubsequence(String s, String t) {
        
//         int i = 0 ;
//         int currentSearchable = 0 ;
        
//         while(i < t.length() && currentSearchable< s.length() ){
//             if(t.charAt(i) == s.charAt(currentSearchable)){
//                 currentSearchable++;
//             }
//             i++;
//         }
        
//         return currentSearchable == s.length();
        
        
        //0 ms solution
        int i = 0 ;
        int currentSearchable = 0 ;
        int n=t.length();
        int m=s.length();
        char charArrayS[]=s.toCharArray();
        char charArrayT[]=t.toCharArray();
        
        while(i < n && currentSearchable< m ){
            if(charArrayT[i] == charArrayS[currentSearchable]){
                currentSearchable++;
            }
            i++;
        }
        
        return currentSearchable == s.length();
    }
}
