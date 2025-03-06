package trees;

import java.util.*;

public class KNodesOfTree {
    public void markParent(TreeNode root, Map<TreeNode,TreeNode> mpp, TreeNode target){
        Queue<TreeNode> Q=new LinkedList<>();
        Q.offer(root);
        while(!Q.isEmpty()){
            TreeNode node=Q.poll();
            if(node.left!=null){
                mpp.put(node.left,node);
                Q.offer(node.left);
            }
            if(node.right!=null){
                mpp.put(node.right,node);
                Q.offer(node.right);
            }
        }
    }
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        Map<TreeNode,TreeNode> mpp=new HashMap<>();
        markParent(root,mpp,target);
        Queue<TreeNode> Q=new LinkedList<>();
        Q.offer(target);
        HashMap<TreeNode,Boolean> visited=new HashMap<>();
        visited.put(target,true);
        int cnt=0;

        while(!Q.isEmpty()){
            int n=Q.size();
            if(cnt==k)break;
            cnt++;
            for(int i=0;i<n;i++){
                TreeNode node=Q.poll();
                if(node.left!=null && visited.get(node.left)==null){
                    Q.offer(node.left);
                    visited.put(node.left,true);
                }

                if(node.right!=null && visited.get(node.right)==null){
                    Q.offer(node.right);
                    visited.put(node.right,true);
                }

                if(mpp.get(node)!=null && visited.get(mpp.get(node))==null){
                    Q.offer(mpp.get(node));
                    visited.put(mpp.get(node),true);
                }
            }
        }
        List<Integer> ans=new ArrayList<>();
        while(!Q.isEmpty()){
            ans.add(Q.poll().val);
        }
        return ans;

    }
    public static void main(String[] args) {

    }
}
