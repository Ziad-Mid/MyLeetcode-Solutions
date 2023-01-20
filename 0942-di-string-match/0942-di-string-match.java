class Solution {
    public int[] diStringMatch(String s) {
        List<Integer> l = new ArrayList<>();
        
        int[] result = new int[s.length()+1];
        
        for(int i = 0 ; i <= s.length() ; i ++)
            l.add(i);
        
        for(int i =0 ; i < result.length-1 ; i ++ )
        {
            if(s.charAt(i) == 'I')
            {    
                result[i]=l.get(0);
                l.remove(0);
             }
            else{
                result[i]=l.get(l.size()-1);
                l.remove(l.size()-1);
            }
            
            if(i==result.length-2)
                result[i+1]=l.get(0);
        }
        
        return result;
    }
}