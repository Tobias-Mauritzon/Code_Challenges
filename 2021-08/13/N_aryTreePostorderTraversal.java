import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

/**
 * Given the root of an n-ary tree, return the postorder traversal of its nodes' values.

    Nary-Tree input serialization is represented in their level order traversal. 
    Each group of children is separated by the null value (See examples)
 */

public class N_aryTreePostorderTraversal {
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
    //itterative
    public List<Integer> postorder2(Node root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) return list;
        
        Stack<Node> stack = new Stack<>();
        stack.add(root);
        
        while(!stack.isEmpty()) {
            root = stack.pop();
            list.add(root.val);
            for(Node node: root.children)
                stack.add(node);
        }
        Collections.reverse(list);
        return list;
    }

    ArrayList<Integer> list = new ArrayList<>();
    
    public List<Integer> postorder(Node root) {
        if (root == null)return list;
        for (Node n : root.children) {
            postorder(n);
        }
        list.add(root.val);
        return list;
    }
}
