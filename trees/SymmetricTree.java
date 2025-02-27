package trees;

public class SymmetricTree {
    public boolean isMirror(TreeNode p,TreeNode q){
        if(p==null && q==null)return true;
        if(p==null || q==null)return false;

        return (p.val==q.val)&& isMirror(p.left,q.right)&& isMirror(p.right,q.left);
    }
    public boolean isSymmetric(TreeNode root) {
        if(root==null)return false;

        return isMirror(root.left,root.right);
    }
}
