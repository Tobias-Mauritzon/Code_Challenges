import java.util.List;

/**
 * Given a n-ary tree, find its maximum depth.

    The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

    Nary-Tree input serialization is represented in their level order traversal, 
    each group of children is separated by the null value (See examples).
 */

public class MaximumDepthNArryTree2 {
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
  
    

    public int maxDepth(Node root) {

        if(root == null)return 0;

        int max = 1;

        for (Node node : root.children) {
            max = Math.max(max,maxDepth(node)+1);
        }

        return max;
    }

    public int maxDepth2(Node root) {

        if(root == null)return 0;

        int max = 0;

        for (Node node : root.children) {
            max = Math.max(max,maxDepth(node));
        }

        return max +1;
    }
}
