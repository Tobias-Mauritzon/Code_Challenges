import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class BinaryTreePostorderTraversal {
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
    
    LinkedList<Integer> list = new LinkedList<>();

    //return the postorder traversal of its nodes' values.
    public List<Integer> postorderTraversal(TreeNode root) {
        if(root == null)return list;
        list.addFirst(root.val);

        if(root.right != null){
            postorderTraversal(root.right);
        }

        if(root.left != null){
            postorderTraversal(root.left);
        }
        return list;
    }

    //return the postorder traversal of its nodes' values whitout global list.
    public List<Integer> postorderTraversal2(TreeNode root) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.addAll(rec(root));
        Collections.reverse(arr);
        return arr;
    }

    public List<Integer> rec(TreeNode root) {
        if(root == null)return new ArrayList<>();
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(root.val);

        if(root.right != null){
            arr.addAll(rec(root.right));
        }

        if(root.left != null){
            arr.addAll(rec(root.left));
        }
        return arr;
    }
}
