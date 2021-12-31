
function TreeNode(val, left, right) {
      this.val = (val===undefined ? 0 : val)
      this.left = (left===undefined ? null : left)
      this.right = (right===undefined ? null : right)
 }



 var map1;
/**
 * @param {TreeNode} root
 * @return {number[]}
 */
 var averageOfLevels = function(root) {
    var retLayer = [[]];
    map1 = new Map();
    recFill(root, 0);
    for(var i = 0; i < map1.size; i++){
        var arr = map1.get(i);
        var sum = 0;
        for(var num of arr){
            sum += num;
        }
        retLayer[i] = sum/arr.length;
    }
    return retLayer;
};
/**
 * @param {TreeNode} root
 * @param {number} layer
 * 
 */
 var recFill = function(root, layer) {
    if(root){
        var arr = map1.get(layer);
    
        if(arr){
            arr.push(root.val);
            map1.set(layer, arr);
        }else{
            map1.set(layer, [root.val]);
        }

        if(root.left){
            recFill(root.left, layer+1);
        }
        
        if(root.right){
            recFill(root.right, layer+1);
        }
    }
};