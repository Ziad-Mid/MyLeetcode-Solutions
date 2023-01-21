class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        if(m*n != original.length)
            return new int[0][0];
        
        int[][] result = new int[m][n];
        int a = 0 , b = 0;
        
            for(int i = 0 ; i < original.length; i ++ ){
            result[a][b] = original[i];
            
            if(b == n - 1)
            {
                a++;
                b = 0;
            }
            else{
               b++;
            }
            
        }
        
        return result;
    }
}