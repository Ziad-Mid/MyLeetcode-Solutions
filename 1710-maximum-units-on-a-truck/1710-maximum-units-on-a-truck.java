class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        
        Arrays.sort(boxTypes, Comparator.comparingInt(o -> -o[1]));
        int result = 0;
        
        
        for(int i = 0 ; i < boxTypes.length ; i++){
            int max = Math.min(boxTypes[i][0],truckSize);
            
                result +=max*boxTypes[i][1];
                
            truckSize -= max ;
            if(truckSize <= 0)
                break;
           
        }
        
        return result;
        
    }
    
    static int[][] columnWiseSorting(int arr[][], int colmn) {
        Arrays.sort(arr, new Comparator<int[]>() {
                    public int compare(int[] frst, int[] scnd) {
                          if(frst[colmn] < scnd[colmn]) {
                                 return 1;
                           }
                          else return -1;
                           }
                          });
    
        return arr;
}
    
}