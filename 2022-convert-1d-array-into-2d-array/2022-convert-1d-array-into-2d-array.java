class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        if(m*n != original.length)
            return new int[0][0];
        
        int[][] result = new int[m][n];
        int i = 0 , j = 0;
        int ans = 0;
        while(i<m){
            result[i][j] = original[ans+i];
            
            if(j == n - 1)
            {
                
                i++;
                j = 0;
            }
            else{
                ans++;
                j++;
            }
            
        }
        
        return result;
    }
}