class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        Map<Integer,Integer> map = new HashMap<>();
        int[] res = new int[nums1.length];
        for(int i = 0 ; i < nums2.length ; i++){
            map.put(nums2[i],i);
        }
        
        for(int i = 0 ; i < nums1.length ; i ++){
          if(map.containsKey(nums1[i])){
                int index = map.get(nums1[i]);
                
                if(index==nums2.length-1){
                    res[i] = -1;
                    continue;
                }
                
                while(index <nums2.length){
                    if(nums2[index]> nums1[i]){
                        res[i] = nums2[index];
                        break;
                    }
                    else{
                        res[i] = -1;
                    }
                    
                    index++;                    
                    
                }
                
            }
        }
        
        
        return res;
    }
}