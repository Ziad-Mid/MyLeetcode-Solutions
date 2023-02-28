class Solution {
    public int findJudge(int n, int[][] trust) {
        
        int length = trust.length ;
        int[] trustCounter = new int[n+1] ;
        
        if(length == 0 && n == 1)
            return 1;
        
        //decrease the number in trustCounter of the first person in a pair
        //increase the number in trustCounter of the second person in a pair
        for(int i = 0 ; i < length ; i ++){
            trustCounter[trust[i][0]] --;
            trustCounter[trust[i][1]] ++;
        }
        
        //check for the person who has n-1 trustCounter
        for(int i = 0 ; i <trustCounter.length ; i ++){
            if(trustCounter[i]== n-1)
                return i;
        }
        
        return -1;
        
    }
}