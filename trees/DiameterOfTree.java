package trees;

public class DiameterOfTree {
    int ans=0;
    public int height(TreeNode root){
        if(root==null)return 0;
        int lh=height(root.left);
        int rh=height(root.right);
        ans=Math.max(ans,lh+rh);
        return 1+Math.max(lh,rh) ;


    }
    public int diameterOfBinaryTree(TreeNode root) {
        int n=height(root);
        return ans;
    }
    public static void main(String[] args) {

    }
}
