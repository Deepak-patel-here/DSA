package trees;

public class BalancedBinaryTree {
    public int height(TreeNode root){
        if(root==null)return 0;
        int lh=height(root.left);
        int rh=height(root.right);
        if(lh==-1 || rh==-1)return -1;
        if(Math.abs(lh-rh)>1)return -1;
        return Math.max(lh,rh)+1;
    }
    public boolean isBalanced(TreeNode root) {
        int n=height(root);
        if(n>=0)return true;
        else return false;
    }
    public static void main(String[] args) {

    }
}
