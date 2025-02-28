package trees;

import java.util.*;

class Pairs{
    int key;
    TreeNode node;

    Pairs(int key,TreeNode node){
        this.key=key;
        this.node=node;
    }
}
public class LeftRightViewTree {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        if(root==null)return ans;
        TreeMap<Integer,Integer> mpp=new TreeMap<>();
        Queue<Pairs> Q=new LinkedList<>();
        Q.add(new Pairs(0,root));

        while(!Q.isEmpty()){
            Pairs p=Q.remove();
            int key=p.key;
            TreeNode node=p.node;

            if(!mpp.containsKey(key))mpp.put(key,node.val);

            if(node.right!=null)Q.add(new Pairs(key+1,node.right));
            if(node.left!=null)Q.add(new Pairs(key+1,node.left));
        }
        for(int num:mpp.values()){
            ans.add(num);
        }
        return ans;
    }
    public static void main(String[] args) {

    }
}
