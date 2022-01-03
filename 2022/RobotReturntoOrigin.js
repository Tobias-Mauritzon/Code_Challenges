/**
 * @param {string} moves
 * @return {boolean}
 */
 var judgeCircle = function(moves) {
    var left = 0;
    var up = 0;
    for(let i = 0; i<moves.length;i++){
        if(moves.charAt(i) === 'L'){
            left++;
        }else if(moves.charAt(i) === 'R'){
            left--;
        }
        else if(moves.charAt(i) === 'U'){
            up++;
        }else{
            up--;
        }
    }

    return left === 0 & up === 0;
};