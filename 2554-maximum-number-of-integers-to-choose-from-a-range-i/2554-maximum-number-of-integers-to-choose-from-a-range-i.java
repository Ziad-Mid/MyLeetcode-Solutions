class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        
        
        int sum = 0;
        int countNumbers = 0;
        
        Set<Integer> setBanned = new HashSet<>();
  
        
        for (Integer t : banned) {
           
            setBanned.add(t);
        }
        
        for(int i=1;i<=n;i++){
            
            if(!setBanned.contains(i)){
            
            
            sum+=i;
            countNumbers++;
            
                if(sum>maxSum)
                    return countNumbers-1;
            
            }
           
        }
        
        return countNumbers;
        
    }
}