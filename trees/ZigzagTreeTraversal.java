package trees;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ZigzagTreeTraversal {
    boolean flag=false;
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> Q=new LinkedList<>();
        List<List<Integer>> res=new LinkedList<>();

        if(root==null)return res;
        Q.offer(root);
        while(!Q.isEmpty()){
            int n=Q.size();
            List<Integer> ans=new LinkedList<>();
            for(int i=0;i<n;i++){
                TreeNode node=Q.poll();
                ans.add(node.val);
                if(node.left!=null)Q.offer(node.left);
                if(node.right!=null)Q.offer(node.right);
            }
            if(flag){
                Collections.reverse(ans);
            }
            res.add(ans);
            flag= !flag;
        }
        return res;
    }
    public static void main(String[] args) {

    }
}
