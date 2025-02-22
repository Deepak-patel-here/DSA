package trees;

import java.util.ArrayList;
import java.util.List;

public class DFS {
    public static void preOrder(TreeNode root, List<Integer> pre){
        if(root==null)return ;
        pre.add(root.val);
        preOrder(root.left,pre);
        preOrder(root.right,pre);
    }

    public static void inOrder(TreeNode root,List<Integer> inList){
        if(root==null)return ;
        inOrder(root.left,inList);
        inList.add(root.val);
        inOrder(root.right,inList);
    }

    public static void postOrder(TreeNode root,List<Integer> post){
        if(root==null)return ;
        postOrder(root.left,post);
        postOrder(root.right,post);
        post.add(root.val);
    }
    public static List<List<Integer>> getTreeTraversal(TreeNode root) {
        List<Integer> in=new ArrayList<>();
        List<Integer> pre=new ArrayList<>();
        List<Integer> post=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
        preOrder(root,pre);
        inOrder(root,in);
        postOrder(root,post);
        ans.add(in);
        ans.add(pre);
        ans.add(post);

        return ans;
    }
    public static void main(String[] args) {

    }
}
