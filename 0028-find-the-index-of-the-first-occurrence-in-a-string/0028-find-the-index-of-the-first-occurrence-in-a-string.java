class Solution {
    public int strStr(String haystack, String needle) {
        
        int n = needle.length();
        int h = haystack.length();
        
        int j =0;
        
        for(int i=0; i<h; i++){
            if(haystack.charAt(i)==needle.charAt(j)){
                j++;
            }
            else{
                i=i-j; 
                j=0;
            }
            if(j==n){
                return i-n+1;
            }
        }
        return -1;
    }
}