class Solution {
    public int minimumOperations(int[] nums) {
        
        int length = nums.length;
        int count = 0;
        
        
        Arrays.sort(nums);
        
        
        int latestNumberSeen = 0;
        for(int i = 0 ; i < length ; i ++){
            if(nums[i] == 0)
                continue;
            else{
                if(nums[i] == latestNumberSeen)
                    continue;
                else{
                    latestNumberSeen = nums[i];
                    count++;
                }
            }
                
        }
        
        
        
        return count;
    }
}

