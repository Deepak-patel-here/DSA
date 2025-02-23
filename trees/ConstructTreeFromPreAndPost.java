package trees;

import java.util.HashMap;
import java.util.Map;

public class ConstructTreeFromPreAndPost {
    int indx=0;
    Map<Integer,Integer> mpp=new HashMap<>();
    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        for(int i=0;i<postorder.length;i++){
            mpp.put(postorder[i],i);
        }
        return buildTree(preorder,postorder,0,postorder.length-1);
    }

    public TreeNode buildTree(int []preorder,int[]postorder,int left,int right){
        if(indx>=preorder.length || left>right){
            return null;
        }
        TreeNode root=new TreeNode(preorder[indx++]);

        if (left == right) return root;

        int leftChild=preorder[indx];
        int boundary=mpp.get(leftChild);

        root.left=buildTree(preorder,postorder,left,boundary);
        root.right=buildTree(preorder,postorder,boundary+1,right-1);
        return root;
    }
    public static void main(String[] args) {

    }
}
