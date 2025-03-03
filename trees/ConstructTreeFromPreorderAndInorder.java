package trees;

import java.util.HashMap;

public class ConstructTreeFromPreorderAndInorder {
    int preIndx=0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer,Integer> mpp=new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            mpp.put(inorder[i],i);
        }
        TreeNode root= build(preorder,0,preorder.length-1,inorder,0,inorder.length-1,mpp);
        return root;


    }

    public TreeNode build(int []preorder,int preStart,int preEnd,int [] inorder,int inStart,int inEnd,HashMap<Integer,Integer> mpp){
        if(preStart>preEnd || inStart>inEnd)return null;

        TreeNode root=new TreeNode(preorder[preStart]);
        int inRoot=mpp.get(root.val);
        int left=inRoot-inStart;

        root.left= build(preorder,preStart+1,preStart+inRoot,inorder,inStart,inRoot-1,mpp);
        root.right=build(preorder,preStart+left+1,preEnd,inorder,inRoot+1,inEnd,mpp);
        return root;

    }
    public static void main(String[] args) {

    }
}
