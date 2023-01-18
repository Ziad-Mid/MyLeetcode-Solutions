class Solution {
    public int maxProduct(int[] nums) {
    
    int firstMax = Integer.MIN_VALUE; 
    int secondMax = Integer.MIN_VALUE; 
        
    for(int n:nums){
        if(n>firstMax){
            secondMax = firstMax;
            firstMax = n;  
        }
        else if(n>secondMax){
            secondMax = n;
        }
    }
    return (firstMax-1)*(secondMax-1);
    }
}