class Solution {
    public String oddString(String[] words) {
        
        Map<String,List<String>> hm = new HashMap<>();
        String result = "";
        
        for(String s : words){
            int n = s.length();
            int[] diffInteger = new int[n-1];
            
            for(int i = 0 ; i <= s.length()-2 ; i ++){
                diffInteger[i] = s.charAt(i+1) - s.charAt(i);
            }
            //add into map
            if(!hm.containsKey(Arrays.toString(diffInteger)))
            {   List<String> l = new ArrayList<>();
                l.add(s);
                hm.put(Arrays.toString(diffInteger),l);
            }
            else
           {    List<String> newList = hm.get(Arrays.toString(diffInteger));
                newList.add(s);
                hm.put(Arrays.toString(diffInteger),newList);
                
            }
        
        }
        
        for (String key : hm.keySet()) 
        {    
            
            if(hm.get(key).size() == 1)
                result = hm.get(key).get(0);
        }
         
        
        return result;
    }
}