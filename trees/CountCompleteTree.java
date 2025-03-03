package trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class CountCompleteTree {
    public int countNodes(TreeNode root) {
        ArrayList<Integer> ans=new ArrayList<>();
        if(root==null)return 0;
        Queue<TreeNode> Q=new LinkedList<>();
        Q.offer(root);
        while(!Q.isEmpty()){
            int n=Q.size();
            for(int i=0;i<n;i++){
                if(Q.peek().left!=null)Q.offer(Q.peek().left);
                if(Q.peek().right!=null)Q.offer(Q.peek().right);
                ans.add(Q.poll().val);
            }
        }
        return ans.size();
    }
    public static void main(String[] args) {

    }
}
