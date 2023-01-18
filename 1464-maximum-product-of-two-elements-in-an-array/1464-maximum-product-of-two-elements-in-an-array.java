class Solution {
    public int maxProduct(int[] nums) {
        int max = 0;
        int n = nums.length;
        
        Arrays.sort(nums);
        
        int first = nums[n-1]-1;
        int second = nums[n-2]-1;
        
        int result = first*second;
        
        
        return result;
    }
}