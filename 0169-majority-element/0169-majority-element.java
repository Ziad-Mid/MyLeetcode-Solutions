class Solution {
    public int majorityElement(int[] nums) {
        
        Map<Integer,Integer> hm = new HashMap<>();
        
        for(int i = 0 ; i < nums.length ; i++){
            if(hm.containsKey(nums[i])){
                hm.put(nums[i],hm.get(nums[i])+1);
            }
            else{
                hm.put(nums[i],1);
            }
        }
        int max = 0;
        int res = 0;
        for(Map.Entry<Integer, Integer> key : hm.entrySet()){
            if(key.getValue()> max){
                res = key.getKey();
                max = key.getValue();
            }
        }
        
        return res;
    }
}