class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int seconds = 0;
        
        for(int i = 0 ; i < points.length-1 ; i ++){
            
            int x = points[i+1][0] - points[i][0];
            int y = points[i+1][1] - points[i][1];
            
            int maxAbs = Math.max(Math.abs(x),Math.abs(y));
            int minAbs = Math.min(Math.abs(x),Math.abs(y));
            
            if(Math.abs(x) == Math.abs(y))
                seconds += Math.abs(x);
            else
                seconds += Math.min(maxAbs,minAbs)+Math.abs(maxAbs-minAbs);
            
        }
        
        return seconds;
    }
}