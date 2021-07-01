import java.util.ArrayList;

public class BinaryTreePreorderTraversal {
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
    
    ArrayList<Integer> list = new ArrayList<>();

    //returns the preorder traversal of its nodes' values
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root == null)return list;
        list.add(root.val);
        if(root.left != null){
            preorderTraversal(root.left);
        }

        if(root.right != null){
            preorderTraversal(root.right);
        }

        return list;
    }
}