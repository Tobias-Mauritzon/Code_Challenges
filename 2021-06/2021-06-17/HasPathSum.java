public class HasPathSum {
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

    // Returns true if it finds a root - leaf path where the sum equals targetsum
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return rec(root, targetSum, 0);
    }

    boolean rec(TreeNode node, int target, int current){
        if(node == null)return false;

        if(node.right == null && node.left == null && current + node.val == target)return true;
        if(node.right == null && node.left == null && current + node.val != target)return false;

        if(node.right == null || node.left == null){
            if(node.left != null)return rec(node.left, target, node.val + current);
            else return rec(node.right, target, node.val + current);
            
        }

        return rec(node.left, target, node.val + current) || rec(node.right, target, node.val + current);
    }
}