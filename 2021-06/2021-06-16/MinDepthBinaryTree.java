public class MinDepthBinaryTree {
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
    //Min depth of lead node
    public int minDepth(TreeNode root) {
        if(root == null)return 0;
        if(root.left == null && root.right == null) return 1;
        if(root.left == null || root.right == null){
            if(root.left != null)return 1 + minDepth(root.left);
            if(root.right != null)return 1 + minDepth(root.right); 
        }
        return 1 + Math.min(minDepth(root.left), minDepth(root.right)); 
    }
}
