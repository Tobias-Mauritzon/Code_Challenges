
/**
 * Given the root of a binary tree, invert the tree, and return its root.
 */
public class InvertBinaryTree {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public TreeNode invertTree(TreeNode root) {
        if(root == null)return null;
        
        TreeNode newNode = new TreeNode();
        newNode.val = root.val;

        if(root.left != null){
            newNode.right = new TreeNode();
            newNode.right = invertTree(root.left);
        }

        if(root.right != null){
            newNode.left = new TreeNode();
            newNode.left = invertTree(root.right);
        }

        return newNode;
    }
}
