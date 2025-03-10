package binarysearchtree;

public class InsertNode {
    public static TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode node=root;
        TreeNode newNode=new TreeNode(val);
        if(root==null)return newNode;
        while(node!=null){

            if(node.val<=val){
                if(node.right!=null)node=node.right;
                else{
                    node.right=newNode;
                    break;
                }
            }else{
                if(node.left!=null)node=node.left;
                else{
                    node.left=newNode;
                    break;
                }
            }
        }
        return root;
    }
    public static void main(String[] args) {

    }
}
