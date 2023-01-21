class Solution {
    public int[] diStringMatch(String s) {
        
        int n = s.length();
        int[] result = new int[n+1];
        int maxValue = n ;
        int minValue = 0 ;
        
        
        for(int i =0 ; i < s.length() ; i ++ )
        {
            result[i] = s.charAt(i) == 'D' ? maxValue-- : minValue++ ;
        }
        result[n] = s.charAt(n-1) == 'D' ? minValue : maxValue ;
        
        return result;
    }

}