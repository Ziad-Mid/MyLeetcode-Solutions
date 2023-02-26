class Solution {
    public int countWords(String[] words1, String[] words2) {
        Map<String,Integer> words1Map = new HashMap<String,Integer>();
        Map<String,Integer> words2Map = new HashMap<String,Integer>();
        
        int count = 0;
        
        for(int i = 0 ; i < words1.length ; i ++)
        {
            words1Map.put(words1[i],words1Map.getOrDefault(words1[i],0) +1);
        }
        for(int i = 0 ; i < words2.length ; i ++)
        {
            words2Map.put(words2[i],words2Map.getOrDefault(words2[i],0) +1);
        }
        
        for (Map.Entry<String, Integer> e : words1Map.entrySet()){
            
            if(e.getValue() == 1)
            {    
                if(words2Map.containsKey(e.getKey()) && words2Map.get(e.getKey()) == 1){
                    count++;
                }
            }
        }
        
        return count;
    }
}