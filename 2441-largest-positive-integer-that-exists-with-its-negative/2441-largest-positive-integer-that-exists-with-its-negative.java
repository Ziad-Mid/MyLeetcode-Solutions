class Solution {
    public int findMaxK(int[] nums) {
        
        int i=0 , j = nums.length-1;
        int res = 0;
        
        Arrays.sort(nums);
        
        while(i != j){
           if(nums[i]<0){
            if(Math.abs(nums[i]) > nums[j] )
	        {    i++;
	            continue;
            }
            else if(Math.abs(nums[i]) < nums[j])
	        {   j--;
	            continue;
            }
            else
                return nums[j];
          }  
           else
               break;
        }
        
        return -1;
        
    }
}