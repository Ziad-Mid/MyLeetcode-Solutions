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
        
        
        
        System.out.println(l.toString());
        return l;
    }
}

// char cs=s.charAt(0),ce=s.charAt(3);
//     char rs=s.charAt(1),re=s.charAt(4);

//     List<String> ls=new ArrayList<>();

//     for(char c=cs;c<=ce;c++){
//         for(char r=rs;r<=re;r++){
//             ls.add(new String(new char[]{c,r}));
//         }
//     }
//     return ls;