class Solution {
    public int subtractProductAndSum(int n) {
        
        int prod = 1 , sum = 0;
        
        while (n > 0) {
            int remainder = n % 10;
            sum += remainder;
            prod *= remainder;
            n = n / 10;
        }
        
        return prod - sum;
    }
    
}