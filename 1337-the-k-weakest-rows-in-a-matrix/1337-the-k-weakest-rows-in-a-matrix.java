class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        
        int[][] rowsPower = new int[mat.length][2];
        int[] result = new int[k];
        
        
        for( int i = 0 ; i < mat.length ; i++){
            int power = 0 ;
            for(int value : mat[i]){
                 power += value; 
            }
            
            rowsPower[i][0] = i ;
            rowsPower[i][1] = power ;
            
        }
        
         Arrays.sort(rowsPower, (a,b) -> a[1] == b[1] ? a[0] - b[0] : a[1] - b[1]);
        
        for(int i = 0 ; i < k ; i ++){
            
            result[i] = rowsPower[i][0];
        }
        return result;
    }
}
