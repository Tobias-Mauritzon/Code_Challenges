/** 
 * @param {number[]} nums
 * @param {number} k
 * @return {number}
 */

 var findMaxAverage = function(nums, k) {
    var maxAvg = Number.NEGATIVE_INFINITY;
    for (let i = 0; i+k < nums.length; i++) {
        let maxTemp = 0;
        for (let j = i;j < i+k; j++) {
            maxTemp += nums[j];   
        }
        maxTemp = maxTemp/k;
        maxAvg = Math.max(maxTemp, maxAvg);
    }
    return maxAvg;
};

//fel
var findMaxAverage2 = function(nums, k) {
    if(nums.length == 1)return nums[0];
    let maxAvg = Number.MIN_VALUE;
    let maxTemp = nums[0];
    for (let i = 1; i < nums.length; i++) {
        maxTemp += nums[i];
        if(i >= k-1){

            let tempAvg = maxTemp/k;
            maxAvg = Math.max(tempAvg, maxAvg);
            maxTemp -= nums[i-k+1];
        }
    }
    return maxAvg;
};

var arr = [1,2,3,4,5,6];

console.log(findMaxAverage(arr,3));