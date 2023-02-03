class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        
        Arrays.sort(boxTypes, Comparator.comparingInt(o -> -o[1]));
        int result = 0;
        
        
        for(int i = 0 ; i < boxTypes.length ; i++){
            if(boxTypes[i][0]<=truckSize){
                truckSize -= boxTypes[i][0];
                result +=boxTypes[i][0]*boxTypes[i][1];
            }
            else{
                result += truckSize*boxTypes[i][1];
                break;
            }
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