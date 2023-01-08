class Solution {
    public boolean divideArray(int[] nums) {
        
        Arrays.sort(nums);
        int i = 0;
        
        while(i< nums.length -1){
            if(nums[i] != nums[i+1]){
                return false;
            }
            i +=2;
        }
        
        return true;
    }
}