package trees;

import java.util.HashMap;
import java.util.Map;

public class ConstructTreeFromInorderAndPostorder {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        Map<Integer, Integer> mpp=new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            mpp.put(inorder[i],i);
        }

        TreeNode root=build(inorder,0,inorder.length-1,postorder,0,postorder.length-1,mpp);
        return root;
    }
    public TreeNode build(int []inorder,int inStart,int inEnd,int []postorder,int postStart,int postEnd,Map<Integer,Integer> mpp){

        if(inStart>inEnd)return null;

        TreeNode root =new TreeNode(postorder[postEnd]);

        int rootIndx=mpp.get(root.val);
        int left=rootIndx-inStart;
        root.left=build(inorder,inStart,rootIndx-1,postorder,postStart,postStart+left-1,mpp);
        root.right=build(inorder,rootIndx+1,inEnd,postorder,postStart+left,postEnd-1,mpp);

        return root;

    }
    public static void main(String[] args) {

    }
}
