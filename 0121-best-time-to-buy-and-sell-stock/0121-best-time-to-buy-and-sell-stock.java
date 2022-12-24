class Solution {
    public int maxProfit(int[] prices) {
        
        
        
        int min =Integer.MAX_VALUE;
        int maxBenefit = Integer.MIN_VALUE ;
        int benefitToday = 0;
      
        
        for(int i = 0 ; i < prices.length ; i ++ ){
            if(prices[i] < min)
            {   min = prices[i];
             }
            
            benefitToday = prices[i] - min;
            
            if(benefitToday > maxBenefit){
                maxBenefit = benefitToday ;
            }
           
        }
        return maxBenefit;

       
        
    }
}