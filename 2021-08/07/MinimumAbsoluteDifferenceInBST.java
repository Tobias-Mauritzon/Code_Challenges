import java.util.ArrayList;
import java.util.Collections;

/**
	Given the root of a Binary Search Tree (BST), 
	return the minimum absolute difference between the values of any two different nodes in the tree.
 */

public class MinimumAbsoluteDifferenceInBST {
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

    int minDiff2 = Integer.MAX_VALUE;
    TreeNode prev;
    
    public int getMinimumDifference2(TreeNode root) {
        inorder(root);
        return minDiff2;
    }
    
    public void inorder(TreeNode root) {
        if (root == null) return;
        inorder(root.left);
        if (prev != null) minDiff2 = Math.min(minDiff2, root.val - prev.val);
        prev = root;
        inorder(root.right);
    }


    public ArrayList<Integer> list = new ArrayList<>();

    public int getMinimumDifference(TreeNode root) {
        getList(root);
        Collections.sort(list);
        int minDiff = Integer.MAX_VALUE;

        for (int i = 1; i < list.size(); i++) {
            minDiff = Math.min(minDiff, Math.abs(list.get(i-1) - list.get(i)));
        }
        return minDiff;
    }

    void getList(TreeNode root){
        if(root != null){
            list.add(root.val);
            getList(root.left);
            getList(root.right);
        }
    }
}
