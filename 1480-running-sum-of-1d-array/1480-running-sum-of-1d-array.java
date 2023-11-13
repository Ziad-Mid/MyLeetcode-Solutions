class Solution {
    public int[] runningSum(int[] nums) {
        
        for(int i = 1 ; i < nums.length ; i ++){
            nums[i] = nums[i] + nums[i-1];
        }
        
        return nums;
    }
}


/*
[1,2,3,4]

1
1+2 = 3
3 + 3 = 6
6 + 4 = 10

*/