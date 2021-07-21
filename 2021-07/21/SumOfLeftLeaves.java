/**
 * Given the root of a binary tree, return the sum of all left leaves.
 */
public class SumOfLeftLeaves {

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

    public int sumOfLeftLeaves(TreeNode root) {
        return rec(root, false);
    }

    public int rec(TreeNode root, boolean left){
        int ret = 0;
        if(root == null)return ret;
        if(left == true && root.left == null && root.right == null)ret = root.val;
        return ret + rec(root.left, true) + rec(root.right, false);
    }
}
