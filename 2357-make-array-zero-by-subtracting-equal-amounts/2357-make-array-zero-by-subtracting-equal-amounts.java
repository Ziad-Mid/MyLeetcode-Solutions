class Solution {
    public int minimumOperations(int[] nums) {
        
        int length = nums.length;
        int count = 0;
        
        
        Arrays.sort(nums);
        
        for(int i = 0 ; i < length ; i ++){
            if(nums[i]==0)
                continue;
            else{
                count++;
                int x = nums[i];
                
                for(int j = i ; j < length ; j++){
                    System.out.println(nums[j]+ "  " +x);
                    
                    nums[j] -= x;
                }
            }
                
        }
        
        
        
        return count;
    }
}

