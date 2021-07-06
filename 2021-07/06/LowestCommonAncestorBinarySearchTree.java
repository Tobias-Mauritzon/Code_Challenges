
/**
 * Given a binary search tree (BST), find the lowest common ancestor (LCA) of two given nodes in the BST.
 *
 *  According to the definition of LCA on Wikipedia: “The lowest common ancestor is defined between two nodes p and q as the lowest 
 * node in T that has both p and q as descendants (where we allow a node to be a descendant of itself).”
 */

public class LowestCommonAncestorBinarySearchTree {
    
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }


    public TreeNode lowestCommonAncestor2(TreeNode root, TreeNode p, TreeNode q){
        
        if(root == null) return root;
      
        if(root.val > p.val && root.val > q.val){
            root = lowestCommonAncestor2(root.left, p ,q);
        }
        else if(root.val < p.val && root.val < q.val){
            root = lowestCommonAncestor2(root.right, p, q);
        }

        return root;
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        if(root == null) return root;
        
        while(root!=null)
        {
            if(root.val > p.val && root.val > q.val){
                root = root.left;
            }
            else if(root.val < p.val && root.val < q.val){
                root = root.right;
            }
            else{ 
                break;
            }
        }
        return root;
 
    }
}
