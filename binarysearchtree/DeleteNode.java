package binarysearchtree;

public class DeleteNode {
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null)return null;
        if(root.val==key)return helper(root);
        TreeNode node=root;
        while(root!=null){
            if(root.val>key){
                if(root.left!=null && root.left.val==key){
                    root.left=helper(root.left);
                    break;
                }else{
                    root=root.left;
                }
            }else{
                if(root.right!=null && root.right.val==key){
                    root.right=helper(root.right);
                    break;
                }else root=root.right;
            }
        }
        return node;

    }
    public TreeNode helper(TreeNode root){
        if(root.right==null)return root.left;
        else if(root.left==null)return root.right;
        else{
            TreeNode right=root.right;
            TreeNode lastRight=findLastRight(root.left);
            lastRight.right=right;
            return root.left;
        }
    }
    public TreeNode findLastRight(TreeNode root){
        if(root.right==null)return root;
        return findLastRight(root.right);
    }
    public static void main(String[] args) {

    }
}
