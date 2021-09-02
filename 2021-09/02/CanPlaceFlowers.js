/**
 * 
 * You have a long flowerbed in which some of the plots are planted, 
 * and some are not. However, flowers cannot be planted in adjacent plots.
 * 
 * Given an integer array flowerbed containing 0's and 1's, where 0 means empty 
 * and 1 means not empty, and an integer n, return if n new flowers can be 
 * planted in the flowerbed without violating the no-adjacent-flowers rule.
 */

/**
 * @param {number[]} flowerbed
 * @param {number} n
 * @return {boolean}
 */
 var canPlaceFlowers = function(flowerbed, n) {

    let count = 0;

    for(let i = 0; i < flowerbed.length && count < n; i++) {
        if(flowerbed[i] == 0) {

            let next = (i == flowerbed.length - 1) ? 0 : flowerbed[i + 1]; 
            let prev = (i == 0) ? 0 : flowerbed[i - 1];
            if(next == 0 && prev == 0) {
                flowerbed[i] = 1;
                count++;
            }
        }
    }
    
    return count === n;
};

// did not know there was no out of bounds exceptions
var canPlaceFlowers2 = function(flowerbed, n) {
    for (let i = 0; i < flowerbed.length && n !== 0; i++) {
        if (flowerbed[i] === 0 && flowerbed[i-1] !== 1 && flowerbed[i+1] !== 1) {
            n--;
            i++;
        }
    }
    return n === 0;
};

/**
 * Constraints:

    1 <= flowerbed.length <= 2 * 104
    flowerbed[i] is 0 or 1.
    There are no two adjacent flowers in flowerbed.
    0 <= n <= flowerbed.length
 */