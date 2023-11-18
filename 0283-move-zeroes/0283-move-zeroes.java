class Solution {
    public void moveZeroes(int[] nums) {
        
        if (nums.length == 1) {
            return;
        }

        int nonZeroId = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[nonZeroId] = nums[i];
                nonZeroId++;
            }
        }

       
         while(nonZeroId<nums.length){
            nums[nonZeroId] = 0;
            nonZeroId++;
        }
        
    }
}
