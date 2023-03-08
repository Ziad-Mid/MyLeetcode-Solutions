class Solution {
    public List<String> cellsInRange(String s) {
        
        List<String> l = new ArrayList<>();
        
        String[] words = s.split(":");
        char col1 = words[0].charAt(0);
        int row1 = words[0].charAt(1) - 48;
        
        char col2 = words[1].charAt(0);
        int row2 = words[1].charAt(1) - 48;
        
        for(int c = col1 ; c <= col2 ; c++){
            for(int r = row1 ; r <= row2 ; r++){
                char col = (char) c;
                
                String cell = col+""+r;
                l.add(cell);
            }
        }
        
        
        
        System.out.println(l.toString());
        return l;
    }
}