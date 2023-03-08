class Solution {
    public List<String> cellsInRange(String s) {
        
        List<String> l = new ArrayList<>();
        
        String[] words = s.split(":");
        char col1 = words[0].charAt(0);
        char row1 = words[0].charAt(1);
        
        char col2 = words[1].charAt(0);
        char row2 = words[1].charAt(1);
        
        for(char c = col1 ; c <= col2 ; c++){
            for(char r = row1 ; r <= row2 ; r++){
                char col = c;
                
                l.add(new String(new char[]{col,r}));
            }
        }
        
        return l;
    }
}
