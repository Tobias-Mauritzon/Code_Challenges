/**
    Given the root of a binary tree, construct a string consists of parenthesis 
    and integers from a binary tree with the preorder traversing way, and return it.

    Omit all the empty parenthesis pairs that do not affect the one-to-one mapping 
    relationship between the string and the original binary tree.
 */

  function TreeNode(val, left, right) {
      this.val = (val===undefined ? 0 : val)
      this.left = (left===undefined ? null : left)
      this.right = (right===undefined ? null : right)
  }
 

 let retString = "";



/**
 * @param {TreeNode} root
 * @return {string}
 */

 var tree2str = function(root) {
    retString = "";
    fillString(root);
    return retString;
};

/**
 * 
 * @param {TreeNode} root 
 * @returns 
 */
function fillString(root) {
    if(!root){
        return;
    }
    
    retString += root.val;

    if(root.left){
        retString += "(";
        fillString(root.left);
        retString += ")";
    }

    if(root.left && root.right){
        retString += "(";
        fillString(root.right);
        retString += ")";
    }else if(root.right){
        retString += "()(";
        fillString(root.right);
        retString += ")";
    }
};