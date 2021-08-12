import java.util.*;
/**
 * Given the root of an n-ary tree, return the preorder traversal of its nodes' values.

    Nary-Tree input serialization is represented in their level order traversal. 
    Each group of children is separated by the null value (See examples)
 */
public class N_aryTreePreorderTraversal {
    class Node {
        public int val;
        public List<Node> children;
    
        public Node() {}
    
        public Node(int _val) {
            val = _val;
        }
    
        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

    ArrayList<Integer> listA = new ArrayList<>();
    
    public List<Integer> preorder2(Node root) {
        if (root == null)return listA;
        list.add(root.val);
        for (Node n : root.children) {
            preorder(n);
        }
        return listA;
    }

    LinkedList<Integer> list = new LinkedList<>();
    
    public List<Integer> preorder(Node root) {
        if (root == null)return list;
        list.add(root.val);
        for (Node n : root.children) {
            preorder(n);
        }
        return list;
    }
}
/**
 * Constraints:

    The number of nodes in the tree is in the range [0, 104].
    0 <= Node.val <= 104
    The height of the n-ary tree is less than or equal to 1000.
 */
