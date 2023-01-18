class Solution {
    public int maxProduct(int[] nums) {
        int max = 0;
        
        for(int i = 0 ; i < nums.length ; i ++){
            for(int j = 0 ; j < nums.length ; j ++){
                int first = nums[i]-1;
                int second = nums[j]-1;
                if(first*second > max && i != j)
                    max = first*second;
            }
        }
        
        return max;
    }
}