public class SortedArrayToBST {

    public static void main(String[] args) {
        int num = 1;
        int num2 = 1;
        System.out.println(num++);
        System.out.println(++num2);
    }

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

    public TreeNode sortedArrayToBST2(int[] nums) {
        int mid = nums.length/2;
        TreeNode root = new TreeNode(nums[mid], new TreeNode(), new TreeNode());

        root.left = rec(root.left, 0, mid-1, nums);
        root.right = rec(root.right, mid+1, nums.length-1, nums);

        return root;
    }

    TreeNode rec(TreeNode node, int stopInkl, int current, int[] arr){
        node.val = arr[current];
        if(stopInkl == current)return node;
        
        node.left = new TreeNode();
        node.left = rec(node.left, stopInkl, --current, arr);
        return node;
    }

    TreeNode recR(TreeNode node, int stopInkl, int current, int[] arr){
        node.val = arr[current];
        if(stopInkl == current)return node;
        
        node.left = new TreeNode();
        node.left = recR(node.left, stopInkl, --current, arr);
        return node;
    }



    public TreeNode sortedArrayToBST(int[] nums) {
        

        int mid = nums.length/2;

        TreeNode tempL = new TreeNode();
        TreeNode tempR = new TreeNode();

        TreeNode root = new TreeNode(nums[mid]);
        root.left = tempL;
        root.right = tempR;

        for(int i = mid-1; i >= 0; i-- ){
            tempL = fillL(tempL, nums[i]);
        }

        for(int i = mid+1; i < nums.length; i++ ){
            tempR = fillL(tempR, nums[i]);
        }


        return root;
    }

    TreeNode fillL(TreeNode node, int num){
        node.val = num;
        node.left = new TreeNode();
        return node.left;
    }

    TreeNode fillR(TreeNode node, int num){
        node.val = num;
        node.right = new TreeNode();
        return node.right;
    }
}
