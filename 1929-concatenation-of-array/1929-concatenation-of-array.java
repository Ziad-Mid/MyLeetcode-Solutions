class Solution {
    public int[] getConcatenation(int[] nums) {
        
        
        int[] res = new int[nums.length*2];
        int n = nums.length;
        int i=0;
        
        while(i<n){
            res[i] = nums[i];
            res[i+n] = nums[i];
            i++;
            
            
        }
        
        
        return res;
        
    }
}