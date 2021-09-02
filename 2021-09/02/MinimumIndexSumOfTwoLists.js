/**
 * @param {string[]} list1
 * @param {string[]} list2
 * @return {string[]}
 */

/**
    Suppose Andy and Doris want to choose a restaurant for dinner, 
    and they both have a list of favorite restaurants represented by strings.

    You need to help them find out their common interest with the least list index sum. 
    If there is a choice tie between answers, output all of them with no order requirement. 
    You could assume there always exists an answer.
*/

//  First Js code challenge
 var findRestaurant = function(list1, list2) {

    let minNumber = Number.MAX_VALUE;
    const map = new Map();

    for(let i = 0; i < list1.length; i++){

        const item = list1[i];
        const index2 = list2.indexOf(item);

        if(index2 !== -1){
            const sum = index2 + i;

            if(minNumber >= sum){
                minNumber = sum;

                const arr = map.get(sum);

                if(typeof arr !== "undefined"){
                    arr.push(item);
                    map.set(sum, arr);
                }else{
                    map.set(sum,[item]);
                }
            }
        }
    }
    return map.get(minNumber);
};

/**
 * Constraints:

    1 <= list1.length, list2.length <= 1000
    1 <= list1[i].length, list2[i].length <= 30
    list1[i] and list2[i] consist of spaces ' ' and English letters.
    All the stings of list1 are unique.
    All the stings of list2 are unique.
 */