class Solution {
    public boolean isPathCrossing(String path) {
        
        Map<String,Integer> hm = new HashMap<>();
        hm.put("0,0",1);
        int x = 0 , y = 0 ;
        
        for(int i = 0 ; i < path.length() ; i++){
            if(path.charAt(i) == 'N')
                y++;
            else if(path.charAt(i) == 'S')
                y--;
            else if(path.charAt(i) == 'E')
                x++;
            else if(path.charAt(i) == 'W')
                x--;
            
            StringBuilder sb = new StringBuilder();
            
            sb.append(x+","+y);
            
            
            if(hm.containsKey(sb.toString()))
                return true;
            
            hm.put(sb.toString(),1);
        }
        
        return false;
    }
}