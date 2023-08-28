class Solution {
    public int maxDistance(int[] colors) {
        
        int length = colors.length ;
        int lastColorId=colors.length-1;
        int firstColorid=0;
        
        while(colors[lastColorId]==colors[0])
            lastColorId--;
        while(colors[firstColorid]==colors[colors.length-1])
            firstColorid++;
        
        return Math.max(colors.length-firstColorid-1,lastColorId);
       
    }
}

