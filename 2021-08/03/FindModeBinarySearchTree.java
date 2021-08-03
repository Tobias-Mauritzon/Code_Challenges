import java.util.*;

public class FindModeBinarySearchTree {
    /**
     * Given the root of a binary search tree (BST) with duplicates, return all the mode(s) (i.e., the most frequently occurred element) in it.
     * If the tree has more than one mode, return them in any order.
     * Assume a BST is defined as follows:
     * 
     *  The left subtree of a node contains only nodes with keys less than or equal to the node's key.
     *  The right subtree of a node contains only nodes with keys greater than or equal to the node's key.
     *  Both the left and right subtrees must also be binary search trees.
     */

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
        
    private HashMap<Integer, Integer> map = new HashMap<>();
    
    public int[] findMode(TreeNode root) {
        
        ArrayList<Integer> list = new ArrayList<>();
        fillMap(root);

        int max = Integer.MIN_VALUE;

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() == max){
                list.add(entry.getKey());
            }else if(entry.getValue() > max){
                max = entry.getValue();
                list.clear();
                list.add(entry.getKey());  
            }
        }

        int[] arr = new int[list.size()];
        
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }

        return arr;
    }

    int fillMap(TreeNode root){
        if(root != null){
            if(map.containsKey(root.val)){
                int val = map.get(root.val);
                map.put(root.val, val + 1);
            }else{
                map.put(root.val, 1);
            }
            return fillMap(root.left)+fillMap(root.right);
        }
        return -1;
    }  

    void fillMap2(TreeNode root){
        if(root != null){
            if(map.containsKey(root.val)){
                int val = map.get(root.val);
                map.put(root.val, val + 1);
            }else{
                map.put(root.val, 1);
            }
            
            fillMap2(root.left);
            fillMap2(root.right);
        }
    }          
}
