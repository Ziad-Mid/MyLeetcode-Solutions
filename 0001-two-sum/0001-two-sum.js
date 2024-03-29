/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 
 */

var twoSum = function twoSum(nums, target) {
    
    const numToIndex = new Map();
    
    for (let i = 0; i < nums.length; i++) {
        
        const complement = target - nums[i];
        
        if (numToIndex.has(complement)) {
            return [numToIndex.get(complement), i];
        }
        
        numToIndex.set(nums[i], i);
    }
    return []; 
}