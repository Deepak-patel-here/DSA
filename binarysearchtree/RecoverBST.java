package binarysearchtree;

public class RecoverBST {
    TreeNode first=null;
    TreeNode second=null;
    TreeNode prev=new TreeNode(Integer.MIN_VALUE);
    public void recoverTree(TreeNode root) {

        search(root);
        int temp=first.val;
        first.val=second.val;
        second.val=temp;
    }

    public void search(TreeNode root){
        if(root==null)return;
        search(root.left);

        if(first==null && prev.val>root.val)first=prev;

        if(first!=null && prev.val>root.val)second=root;

        prev=root;
        search(root.right);
        return;

    }

    public static void main(String[] args) {

    }
}
