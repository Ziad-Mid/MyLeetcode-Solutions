class Solution {
    public int numSteps(String s) {
        int carry=0,count=0;
        
        if(s.length()==1)
            return 0;
        
        for(int i=s.length()-1;i>=0;i--)
        {
            if(i==0 && s.charAt(i)=='1' && carry==0)
                break;
                
            int tmp= Character.getNumericValue(s.charAt(i))  +carry;
            if(tmp%2==0)
            {
                carry=tmp/2;
                count++;
            }
            else
            {
                count+=2;
                carry=1;
            }
        }
        return count;
    }
}