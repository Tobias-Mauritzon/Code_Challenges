/**
 * Given an integer array nums, 
 * find three numbers whose product is maximum and return the maximum product.
 */


/**
 * @param {number[]} nums
 * @return {number}
 * Cleaner version
 */
 var maximumProduct2 = function(nums) {
    nums.sort(function(a, b) {return a - b;});
    
    return Math.max(nums[0] * nums[1] * nums[nums.length - 1], nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3]);
};

/**
 * @param {number[]} nums
 * @return {number}
 */
 var maximumProduct = function(nums) {

    let len = nums.length;

    if(len === 3){
        return nums[0] * nums[1] * nums[2];
    }
    nums.sort(function(a, b) {return a - b;});

    if(nums[len-1] < 0){
        return nums[0] * nums[1] * nums[2];
    }

    return nums[len-1] * Math.max(nums[len-2] * nums[len-3], nums[0] * nums[1]);

};

//You could also just search once and that would be much faster to get the 5 key numbers and save them for the same comparison.


/**
 * Constraints:

    3 <= nums.length <= 104
    -1000 <= nums[i] <= 1000
 */