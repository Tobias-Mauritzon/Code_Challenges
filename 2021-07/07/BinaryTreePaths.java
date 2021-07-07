import java.util.ArrayList;
import java.util.List;

/**
 * Given the root of a binary tree, return all root-to-leaf paths in any order.
 * A leaf is a node with no children.
 */

public class BinaryTreePaths {

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

    ArrayList<String> list = new ArrayList<>();

    public List<String> binaryTreePaths(TreeNode root) {
        rec(root, "");

        return list;
    }

    void rec(TreeNode root, String path){
        if(root.left == null && root.right == null){
            path = path +root.val;
            list.add(path);
            return;
        }

        if(root.left != null){
            String tmepPath = path +root.val +"->";
            rec(root.left, tmepPath);
        }

        if(root.right != null){
            String tmepPath = path +root.val +"->";
            rec(root.right, tmepPath);
        }

        return;
    }

    public List<String> binaryTreePaths2(TreeNode root) {
        return rec2(root, "");
    }

    ArrayList<String> rec2(TreeNode root, String path){
        ArrayList<String> arr = new ArrayList<>();

        if(root.left == null && root.right == null){
            path = path +root.val;
            arr.add(path);
            return arr;
        }

        if(root.left != null){
            String tmepPath = path +root.val +"->";
            arr.addAll(rec2(root.left, tmepPath));
        }

        if(root.right != null){
            String tmepPath = path +root.val +"->";
            arr.addAll(rec2(root.right, tmepPath));
        }

        return arr;
    }
}
