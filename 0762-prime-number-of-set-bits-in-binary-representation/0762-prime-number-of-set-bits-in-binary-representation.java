class Solution {
    public int countPrimeSetBits(int left, int right) {
        
        int result = 0 ;

        for(int i = left ; i <= right ; i++){
            String numberBinary = Integer.toBinaryString(i);
            int numSetBits = 0;
            
            for(Character c : numberBinary.toCharArray()){
                boolean b = c.equals('1');
                if(b){
                    numSetBits++;
                }
            }
            
            
            if(isPrime(numSetBits))
                result++;
        
        }
        
        return result;
    }
    
    public boolean isPrime(int n){
        if(n==0||n==1){  
            return false;
          }
        else{  
           for(int i=2;i<=n/2;i++){
            if(n%i==0){      
             return false;  
            }      
           }    
            
          }
        
        return true;
    }
}