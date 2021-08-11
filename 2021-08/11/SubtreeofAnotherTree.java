import java.util.LinkedList;
import java.util.Stack;

/**
	Given the roots of two binary trees root and subRoot, 
	return true if there is a subtree of root with the same 
	structure and node values of subRoot and false otherwise.

	A subtree of a binary tree tree is a tree that consists of a 
	node in tree and all of this node's descendants. 
	The tree tree could also be considered as a subtree of itself.
*/

public class SubtreeofAnotherTree {

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

    //cleaner but still slow
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        String rootString = generatepreorderString(root); 
        String subRootString = generatepreorderString(subRoot);
        
        return rootString.contains(subRootString) ;
    }

    public String generatepreorderString(TreeNode s){

        StringBuilder strB = new StringBuilder();
        Stack<TreeNode> stacktree = new Stack();
        stacktree.push(s);

        while(!stacktree.isEmpty()){
            TreeNode popnode = stacktree.pop();
            if(popnode==null)
            strB.append(",#"); 
            else      
            strB.append(","+popnode.val);
            if(popnode!=null){
                stacktree.push(popnode.right);    
                stacktree.push(popnode.left);  
            }
        }
        return strB.toString();
    }

    
    LinkedList<Integer> subRootList = new LinkedList<>();
    LinkedList<Integer> rootSubList = new LinkedList<>();
    Boolean subTrue = false;

    //Slow solution
    public boolean isSubtree2(TreeNode root, TreeNode subRoot) {
        populateSubRoot(subRoot, subRootList);
        rec(root);
        return subTrue;
    }

    public boolean populateSubRoot(TreeNode root, LinkedList<Integer> list){
        if(root == null){
            list.add(null);
            return false;
        }

        list.add(root.val);
        populateSubRoot(root.left, list);
        populateSubRoot(root.right, list);

        return true;
    }

    public boolean rec(TreeNode root){
        if(root == null)return false;
        Boolean ret = false;
        if(root.val == subRootList.peekFirst()){
            subTrue = checkRoots(root);
        }

        if(subTrue == false){
            rec(root.left);
        }
        if(subTrue == false){
            rec(root.right);
        }

        return ret;
    }

    public boolean checkRoots(TreeNode root){
        populateSubRoot(root, rootSubList);

        boolean res = rootSubList.equals(subRootList);

        rootSubList.clear();

        return res;
    }
}
