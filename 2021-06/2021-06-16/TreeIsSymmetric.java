import java.util.ArrayList;

public class TreeIsSymmetric {

    ArrayList<Integer> listL = new ArrayList<>();
    ArrayList<Integer> listR = new ArrayList<>();

	//Returns true if tree is symmetric
    public boolean isSymmetric3(TreeNode root) {
        if(root.left == null && root.right == null){
            return true;
        }else if(root.left == null || root.right == null){
            return false;
        } 

        recL3(root.left);
        recR3(root.right);

        if(listL.size() == listR.size()){
            for(int i = 0; i < listL.size(); i++){
                if(listL.get(i) != listR.get(i))return false;
            }
        }else{
            return false;
        }
   
        return true;
    }
   
    void recL3(TreeNode node){
        if(node == null){
            listL.add(null); 
            return;
        }

        listL.add(node.val);

        recL3(node.left);
        recL3(node.right);
    }

    void recR3(TreeNode node){
        if(node == null){
            listR.add(null); 
            return;
        }

        listR.add(node.val);

        recR3(node.right);
        recR3(node.left);
    }

	// Works but also returns true if last value is not symmetric but the same number
    public boolean isSymmetric(TreeNode root) {
        if(root.left == null && root.right == null){
            return true;
        }else if(root.left == null || root.right == null){
            return false;
        } 

        recL(root.left);
        recR(root.right);

        if(listL.size() == listR.size()){
            for(int i = 0; i < listL.size(); i++){
                if(listL.get(i) != listR.get(i))return false;
            }
        }else{
            return false;
        }
   
        return true;
    }
   
    void recL(TreeNode node){
        if(node == null)return;

        listL.add(node.val);

        if(node.left != null)recL(node.left);

        if(node.right != null)recL(node.right);
    }

    void recR(TreeNode node){
        if(node == null)return;

        listR.add(node.val);

        if(node.right != null)recR(node.right);

        if(node.left != null)recR(node.left);
    }

    public boolean isSymmetric2(TreeNode root) {

        if(root.left == null && root.right == null){
            return true;
        }else if(root.left == null || root.right == null){
            return false;
        }

        ArrayList<Integer> listL = new ArrayList<>();
        ArrayList<Integer> listR = new ArrayList<>();

        listL.add(root.left.val);
        recL2(root.left, listL);

        listR.add(root.right.val);
        recR2(root.right, listR);

        if(listL.size() == listR.size()){
            for(int i = 0; i < listL.size(); i++){
                if(listL.get(i) != listR.get(i))return false;
            }
        }else{
            return false;
        }

        return true;
    }
	
	//Does not work
    void recL2(TreeNode node, ArrayList<Integer> l){
        if(node == null)return;

        if(node.left != null){
            recL2(node.left, l); 
            l.add(node.left.val);
        }
        else{
            l.add(-1000);
        }

        if(node.right != null){
            recL2(node.right, l); 
            l.add(node.right.val);
        }else{
            l.add(-1000);
        }
    }

    void recR2(TreeNode node, ArrayList<Integer> l){
        if(node == null)return;

        if(node.right != null){
            recR2(node.right, l); 
            l.add(node.right.val);
        }
        else{
            l.add(-1000);
        }

        if(node.left != null){
            recR2(node.left, l); 
            l.add(node.left.val);
        }else{
            l.add(-1000);
        }
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
}