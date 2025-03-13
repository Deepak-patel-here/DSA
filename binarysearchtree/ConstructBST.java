package binarysearchtree;

public class ConstructBST {
    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode root=new TreeNode(preorder[0]);
        for(int i=1;i<preorder.length;i++){
            TreeNode newNode=new TreeNode(preorder[i]);
            TreeNode node=root;
            root=addChild(node,newNode);
        }
        return root;
    }

    public TreeNode addChild(TreeNode root,TreeNode child){
        TreeNode node=root;
        while(node!=null){
            if(node.val<child.val){
                if(node.right!=null)node=node.right;
                else {
                    node.right=child;
                    break;
                }

            }else {
                if(node.left!=null)node=node.left;
                else{
                    node.left=child;
                    break;
                }
            }
        }
        return root;
    }
    public static void main(String[] args) {

    }
}
