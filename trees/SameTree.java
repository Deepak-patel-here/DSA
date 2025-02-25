package trees;

public class SameTree {
    public boolean ifSame(TreeNode p,TreeNode q){
        if(p==null && q==null)return true;

        if(p==null || q==null || p.val!=q.val)return false;


        boolean left=ifSame(p.left,q.left);
        boolean right=ifSame(p.right,q.right);

        return left && right;


    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return ifSame(p,q);
    }
    public static void main(String[] args) {

    }
}
