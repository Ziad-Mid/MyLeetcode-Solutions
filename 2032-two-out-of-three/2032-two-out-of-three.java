class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        
        List<Integer> result =new ArrayList<>();
        
        Set<Integer> lNums1=new HashSet<>();
        Set<Integer> lNums2=new HashSet<>();
        
        for(int i:nums1)
            lNums1.add(i);
        
        
        for(int i:nums2)
        {
            if(lNums1.contains(i) && !result.contains(i)){
                result.add(i);
            }
            
            lNums2.add(i);
        }
        
        for(int i:nums3)
        {
            if((lNums1.contains(i) || lNums2.contains(i)) && !result.contains(i)){
                result.add(i);
            }
        }
        
        return result;
        
    }
}