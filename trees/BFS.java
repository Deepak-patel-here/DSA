package trees;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFS {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> Q=new LinkedList<>();
        List<List<Integer>> ans=new LinkedList<>();

        if(root==null)return ans;
        Q.offer(root);
        while(!Q.isEmpty()){
            int len=Q.size();
            List<Integer> res=new LinkedList<>();
            for(int i=0;i<len;i++){
                if(Q.peek().left !=null) Q.offer(Q.peek().left);
                if(Q.peek().right !=null) Q.offer(Q.peek().right);
                res.add(Q.poll().val);
            }
            ans.add(res);
        }
        return ans;
    }
    public static void main(String[] args) {

    }
}
