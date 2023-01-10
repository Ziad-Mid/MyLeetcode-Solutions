class Solution {
    public int countPoints(String rings) {
        
        Map<Character, List<Character>> rodsMap  = new HashMap<>();
        int result = 0 ;
        
        for(int i = 0 ; i < rings.length() ; i +=2){
            if(!rodsMap.containsKey(rings.charAt(i+1))){
                List<Character> list = new ArrayList();
                list.add(rings.charAt(i));
                rodsMap.put(rings.charAt(i+1), list);
            }
            else{
                List<Character> retreivedList = rodsMap.get(rings.charAt(i+1));
                if(!retreivedList.contains(rings.charAt(i))){
                    retreivedList.add(rings.charAt(i));
                    rodsMap.put(rings.charAt(i+1),retreivedList);
                    if(retreivedList.size() == 3){
                        result++;
                    }
                }
                
            }
        }
        
        return result;
    }
}