package trees;

public class InvertBinaryTree {
    public TreeNode change(TreeNode root){
        if(root==null)return null;

        TreeNode left=change(root.left);
        TreeNode right=change(root.right);

        root.left=right;
        root.right=left;
        return root;
    }
    public TreeNode invertTree(TreeNode root) {
        root=change(root);
        return root;
    }
    public static void main(String[] args) {

    }
}
